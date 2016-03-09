package com.zhou.solution190;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	
	private static Solution solution = new Solution();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReverseBits() {
		assertEquals(1, solution.reverseBits(1));
	}

}
