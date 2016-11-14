public class Solution {
    public boolean isHappy(int n) {
        Set<Integer>set=new HashSet<Integer>();
        int sum=0;
        while(n!=1){
            if(set.contains(n)){
                return false;
            }else{
                 set.add(n);
            }
            sum=0;
            while(n!=0){
                sum+=Math.pow(n%10,2);
                n/=10;
            }
            n=sum;
        }
        return true;
    }
}