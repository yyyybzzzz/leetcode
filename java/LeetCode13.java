public class Solution {
    public int romanToInt(String s) {
        int res=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            if((i+1)<len&&getRomanValue(s.charAt(i+1))>getRomanValue(s.charAt(i))){
                res-=getRomanValue(s.charAt(i));
            }else{
                res+=getRomanValue(s.charAt(i));
            }
        }
        return res;
    }
     public int getRomanValue(char c) {  
        switch(c) {  
            case 'I': return 1;   
            case 'V': return 5;  
            case 'X': return 10;  
            case 'L': return 50;  
            case 'C': return 100;  
            case 'D': return 500;  
            case 'M': return 1000;  
            default: return 0;  
        }  
    }  
}