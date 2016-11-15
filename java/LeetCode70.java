public class Solution {
    public int climbStairs(int n) {
        int[]f=new int[n+1];
        if(n<=2){
            return n;
        }
        f[0]=0;
        f[1]=1;
        f[2]=2;
        for(int i=3;i<=n;i++){
           f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
}