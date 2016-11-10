public class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer>map=new HashMap<Character,Integer>();
        int result=0;
        int sign=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(Character c:map.keySet()){
            if(map.get(c)%2==0){
                result+=map.get(c);
            }else{
                sign=1;
               result+=map.get(c)-1;
            }
        }
        return result+sign;
    }
}