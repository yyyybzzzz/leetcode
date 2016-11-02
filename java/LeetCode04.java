package com.leetcode.project;

public class LeetCode04 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length == 0) {
			return (nums2[(nums2.length + 1) / 2] + nums2[(nums2.length + 2) / 2]) / 2.0;
		} else if (nums2.length == 0) {
			return (nums1[(nums1.length + 1) / 2] + nums1[(nums1.length + 2) / 2]) / 2.0;
		}
		int k1 = (nums1.length + nums2.length + 1) / 2;
		int k2 = (nums1.length + nums2.length + 2) / 2;
		return (findMedian(nums1, 0, nums2, 0, k1) + findMedian(nums1, 0, nums2, 0, k2)) / 2.0;
	}

	// 二分查找
	public double findMedian(int[] nums1, int a_begin, int[] nums2, int b_begin, int k) {
		if (a_begin > nums1.length - 1) {
			return nums2[b_begin + k - 1];
		}
		if (b_begin > nums2.length - 1) {
			return nums1[a_begin + k - 1];
		}
		if (k == 1) {
			return nums1[a_begin] < nums2[b_begin] ? nums1[a_begin] : nums2[b_begin];
		}
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		if (a_begin + k / 2 - 1 < nums1.length) {
			a = nums1[a_begin + k / 2 - 1];
		}
		if (b_begin + k / 2 - 1 < nums2.length) {
			b = nums2[b_begin + k / 2 - 1];
		}
		if (a < b)// 此时a_begin+k/2-1之前的数都小于要求的数，则删除这k/2个数并 查找第k-k/2小的数
			return findMedian(nums1, a_begin + k / 2, nums2, b_begin, k - k / 2);
		return findMedian(nums1, a_begin, nums2, b_begin + k / 2, k - k / 2);

	}

	// 归并 时间复杂度O(m+n)
	// public double findMedian(int[] nums1, int[] nums2, int total) {
	// int m = nums1.length;
	// int n = nums2.length;
	// int i = 0;
	// int j = 0;
	// int k = 0;
	// int[] ans = new int[m + n];
	// while (i < m && j < n) {
	// if (nums1[i] < nums2[j]) {
	// ans[k] = nums1[i];
	// i++;
	// } else {
	// ans[k] = nums2[j];
	// j++;
	// }
	// k++;
	// }
	// if (i < m) {
	// for (; i < m; i++) {
	// ans[k] = nums1[i];
	// k++;
	// }
	// } else if (j < n) {
	// for (; j < n; j++) {
	// ans[k] = nums2[j];
	// k++;
	// }
	// }
	// for(i=0;i<total;i++){
	// System.out.println(ans[i]);
	// }
	// if (total % 2 != 0)
	// return ans[(total + 1) / 2 - 1];
	// return (ans[total / 2 - 1] + ans[total / 2]) / 2.0;
	// }
}
