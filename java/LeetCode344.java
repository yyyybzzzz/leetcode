package com.leetcode.project;

public class LeetCode344 {
	public String reverseString(String s) {
		if (s.length() >= 2)
			return re(s.substring(s.length() / 2, s.length())) + re(s.substring(0, s.length() / 2));
		else
			return s;

	}

	public String re(String s) {
		if (s.length() == 1) {
			return s;
		}
		if (s.length() == 2) {
			String temp1 = s.charAt(0) + "";
			String temp2 = s.charAt(1) + "";
			return temp2 + temp1;
		}
		if (s.length() == 0)
			return s;
		return re(s.substring(s.length() / 2, s.length())) + re(s.substring(0, s.length() / 2 ));
	}
}
