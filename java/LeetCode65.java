public class Solution {
    public int[] plusOne(int[] digits) {
        int[]res=new int[digits.length+1];
        int carry=1;
        int mod=0;
        for(int i=digits.length-1;i>=0;i--){
            mod=(digits[i]+carry)%10;
            carry=(digits[i]+carry)/10;
            digits[i]=mod;
            res[i]=mod;
            if(carry==0){
                return digits;
            }
        }
        res[0]=1;
        return res;
    }
}