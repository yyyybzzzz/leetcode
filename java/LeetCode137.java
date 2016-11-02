package com.leetcode.project;

public class LeetCode137 {
	public int singleNumber(int[] nums) {
		int[]bit=new int[32];
        int result=0;
        for(int i=0;i<32;i++){
            for(int j=0;j<nums.length;j++){
                bit[j]+=(nums[i]>>j)&1;
            }
            bit[i]%=3;
            result|=bit[i]<<i;
        }
        return result;
	}
}
