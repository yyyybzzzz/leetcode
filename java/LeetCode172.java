public class Solution {
    public int trailingZeroes(int n) {
        int res=0;
        if(n<5){
            return 0;
        }
        while(n>=5){
            res+=n/5;
            n=n/5;
        }
        return res;
    }
}