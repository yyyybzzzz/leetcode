public class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int n1=0;
        int n2=0;
        int mod=0;
        int carry=0;
        String s="";
        while(i>=0||j>=0){
            n1=n2=0;
            if(i>=0){
                n1=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                n2=num2.charAt(j)-'0';
                j--;
            }
            mod=(n1+n2+carry)%10;
            carry=(n1+n2+carry)/10;
            s=mod+s;
        }
        if(carry!=0){
            s=1+s;
        }
        return s;
    }
    
}