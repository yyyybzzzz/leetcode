public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<=0){
            return false;
        }
        int k=0;
        for(int i=0;i<32;i++){
            if(((num&1))==1&&(i%2!=0)){
                return false;
            }else if(((num&1))==1){
                k++;
                if(k>1){
                    return false;
                }
            }
            num>>=1;
        }
        return true;
    }
}