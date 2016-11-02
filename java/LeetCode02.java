package com.leetcode.project;

import java.util.HashMap;
import java.util.Map;

public class LeetCode02 {
	public int solution(String s) {
		int max = 0;// 最大值
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int j = 0, i = 0; j < s.length(); j++) {
			if (!map.containsKey(s.charAt(j))) {
				map.put(s.charAt(j), j);// 如果不包含当前字母，加入
				max = Math.max(max, j - i + 1);// 计算长度
			} else {// 如果包含
				if (map.get(s.charAt(j)) >= i) {// 当前子串中出现相同的字符
					i = map.get(s.charAt(j)) + 1;// 把i移动到与当前字符相同的字符处，并加1
				}
				map.put(s.charAt(j), j);//把当前相同字符移动到最后一位
				max = Math.max(max, j - i + 1);//计算最长子串
			}
		}
		return max;
	}
}
