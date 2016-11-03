public class Solution {
    public void moveZeroes(int[] nums) {
        // 发现0，k++;
        //后边的数向前移动k位
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                k++;
                continue;
            }
            nums[i-k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[nums.length-i-1]=0;
        }
    }
}