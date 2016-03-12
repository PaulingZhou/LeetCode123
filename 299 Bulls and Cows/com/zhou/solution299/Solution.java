package com.zhou.solution299;

public class Solution {
    public String getHint(String secret, String guess) {
        int[] guessArray = new int[10];
        int[] secretArray = new int[10];
        int bulls = 0, cows = 0;
        for(int i = 0; i < secret.length(); i++){
        	if(secret.charAt(i) == guess.charAt(i)) bulls++;
        	else{
        		guessArray[guess.charAt(i)-'0']++;
        		secretArray[secret.charAt(i)-'0']++;
        	}
        }
        for(int j = 0; j < 10; j++){
        	cows += Math.min(guessArray[j], secretArray[j]);
        }
        return bulls + "A" + cows + "B";
    }
}
