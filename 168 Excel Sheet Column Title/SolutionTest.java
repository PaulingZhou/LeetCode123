package com.zhou.solution168;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	public static Solution s = new Solution();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConvertToTitle() {
		assertEquals("X", s.convertToTitle(24));
	}

}
