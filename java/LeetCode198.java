public class Solution {
    public int rob(int[] nums) {
        if(nums.length<=0){
            return 0;
        }else if(nums.length<2){
            return nums[0];
        }
        int[]f=new int[nums.length+1];
        f[0]=0;
        f[1]=nums[0];
        f[2]=Math.max(nums[0],nums[1]);
        for(int i=3;i<f.length;i++){
            f[i]=Math.max(nums[i-1]+f[i-2],nums[i-2]+f[i-3]);
        }
        return f[f.length-1];
    }
}