import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
		Map<Character, Boolean> map = new HashMap<Character, Boolean>() {

			/**
			 * default key to eliminate warning, don't know how it works
			 */
			private static final long serialVersionUID = 1L;
		};

		// valid line
		for (int i = 0; i < 9; i++) {
			mapInit(map);
			for (int j = 0; j < 9; j++) {
				char element = board[i][j];
				if (element != '.') {
					boolean a = map.get(element);
					if (a)
						return false;
					else
						map.put(element, true);
				}
			}
		}
		System.out.println("line valid");
		// valid array
		for (int i = 0; i < 9; i++) {
			mapInit(map);
			for (int j = 0; j < 9; j++) {
				char element = board[j][i];
				if (element != '.') {
					boolean a = map.get(element);
					if (a)
						return false;
					else
						map.put(element, true);
				}
			}
		}
		System.out.println("array valid");
		// valid square
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				mapInit(map);
				for (int j = 3 * i; j < 3 * i + 3; j++) {
					for (int l = 3 * k; l < 3 * k + 3; l++) {
						char element = board[j][l];
						if (element != '.') {
							boolean a = map.get(element);
							if (a) {
								return false;
							} else {
								map.put(element, true);
							}
						}
					}
				}
			}
		}
		System.out.println("square valid");
		return true;
	}

	private void mapInit(Map<Character, Boolean> map) {
		for (char a = '1'; a <= '9'; a++) {
			map.put(a, false);
		}
	}
	
}
