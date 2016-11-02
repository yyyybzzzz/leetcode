package com.leetcode.project;

import java.util.HashMap;
import java.util.Map;

public class LeetCode02 {
	public int solution(String s) {
		int max = 0;// ���ֵ
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int j = 0, i = 0; j < s.length(); j++) {
			if (!map.containsKey(s.charAt(j))) {
				map.put(s.charAt(j), j);// �����������ǰ��ĸ������
				max = Math.max(max, j - i + 1);// ���㳤��
			} else {// �������
				if (map.get(s.charAt(j)) >= i) {// ��ǰ�Ӵ��г�����ͬ���ַ�
					i = map.get(s.charAt(j)) + 1;// ��i�ƶ����뵱ǰ�ַ���ͬ���ַ���������1
				}
				map.put(s.charAt(j), j);//�ѵ�ǰ��ͬ�ַ��ƶ������һλ
				max = Math.max(max, j - i + 1);//������Ӵ�
			}
		}
		return max;
	}
}
