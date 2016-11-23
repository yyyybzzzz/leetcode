public class Solution {  
    public boolean repeatedSubstringPattern(String str) {  
        if(str.length() < 2) return false;  
        int l=1;
        int sign=1;
        int len=str.length();
        while(l<=len/2){
            if(len%l==0){
                sign=1;
                String check=str.substring(0,l);
                for(int i=1;i<len/l;i++){
                    if(!str.substring(i*l,(i+1)*l).equals(check)){
                        sign=0;
                        break;
                    }
                }
                if(sign==1){
                    return true;
                }
            }
            l++;
        }
        return false;
    }
}  

