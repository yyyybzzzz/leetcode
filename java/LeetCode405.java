public class Solution {
    public String toHex(int num) {
        String hex="";
        if(num>=0&&num<16){
            return hex(num);
        }
        for(int i=0;i<8;i++){
            hex=hex((num>>(i*4))&15)+hex;
        }
        while(hex.charAt(0)=='0'){
            hex=hex.substring(1);
        }
        return hex;
    }
    public String hex(int num){
        String hex="";
        if(num<10){
            hex+=(char)(num+'0');
        }else{
            hex+=(char)(num-10+'a');
        }
        return hex;
    }
}







public class Solution {
    public String toHex(int num) {
        String hex="";
        String s="0123456789abcdef";
        for(int i=0;i<8;i++){
            hex=s.charAt(num&15)+hex;
            num>>=4;
        }
        while(hex.length()>1&&hex.charAt(0)=='0'){
            hex=hex.substring(1);
        }
        return hex;
    }
}