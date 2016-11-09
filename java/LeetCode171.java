public class Solution {
    public int titleToNumber(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            result=(s.charAt(i)-'A'+1)+result*26;
        }
        return result;
    }
}