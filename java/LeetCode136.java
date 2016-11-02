package com.leetcode.project;

public class LeetCode136 {
	public int singleNumber(int[] A) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		if (A == null || A.length == 0) {
			return 0;
		}
		int result = A[0];

		for (int i = 1; i < A.length; i++) {
			result = result ^ A[i];
		}
		return result;
	}
}
