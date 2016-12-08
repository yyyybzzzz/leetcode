public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(guess(n)==0){
            return n;
        }
        long begin=1,end=n;
        int check=guess((int)((begin+end)/2));
        while(check!=0){
            if(check<0){
                end=(begin+end)/2;
            }else{
                begin=(begin+end)/2;
            }
            check=guess((int)((begin+end)/2));
        }
        return (int)((begin+end)/2);
    }
}