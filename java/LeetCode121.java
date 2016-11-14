public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int curmin=prices[0];
        int max=0;
        int[]pre=new int[prices.length];
        for(int i=1;i<prices.length;i++){
            curmin=curmin>prices[i]?prices[i]:curmin;
            pre[i]=pre[i-1]>(prices[i]-curmin)?pre[i-1]:(prices[i]-curmin);
        }
        max= pre[0];
        for(int i=1;i<prices.length;i++){
           max=max<pre[i]?pre[i]:max;
        }
        return max;
    }
}