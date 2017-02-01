public class Solution {
    int count=0;
    String last="1";
    Character l;
    String result="1";
    public String countAndSay(int n) {
        for(int i=1;i<n;i++){
            say(result);
        }
        return result;
    }
    public void say(String last){
        result="";
        count=0;
        l=last.charAt(0);
        for(int i=0;i<last.length();i++){
            if(last.charAt(i)==l){
                count++;
            }else{
                result=result+count+""+l;
                l=last.charAt(i);
                count=1;
            }
        }
        result=result+count+""+l;
    } 
}