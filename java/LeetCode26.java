//н╢еепР
public class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        int len=nums.length;
        int count=0;
        while(i<len-1){
            if(nums[j]==nums[i]){
                count++;
            }
            else{
                nums[j-count]=nums[j];
            }
            j++;
            if(j==len){
                i+=1;
                j=i+1;
                len-=count;
                count=0;
                continue;
            }
        }
        return len;
    }
}


//ряеепР
public class Solution {
    public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
}