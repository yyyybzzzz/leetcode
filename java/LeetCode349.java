public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<Integer>();
		Set<Integer> res = new HashSet<Integer>();
		for (int n : nums1) {
			s.add(n);
		}
		for (int n : nums2) {
			if (s.contains(n)) {
				res.add(n);
			}
		}
		int[]r=new int[res.size()];
		int i=0;
		for(int a:res){
			r[i]=a;
			i++;
		}
		return r;
    }
}