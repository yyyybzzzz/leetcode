public class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
           if(nums[i]==val){
               count++;
           }else{
               nums[i-count]=nums[i];
           }
        }
        return n-count;
    }
}