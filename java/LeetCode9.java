public class Solution {
    public boolean isPalindrome(int x) {
        int len=0;
        if(x<0){
            return false;
        }
        int temp=x;
        while(temp!=0){
            len++;
            temp/=10;
        }
        return test(x,len);
    }
    public boolean test(int x,int len){
        if(len<=1){
            return true;
        }
        else if(len==2){
            if(x/10==x%10){
                return true;
            }
            return false;
        }
        if((int)(x/Math.pow(10,len-1))!=x%10){
            return false;
        }
        x=(int)(x%Math.pow(10,len-1))/10;
        len-=2;
        return true&test(x,len);
    }
}