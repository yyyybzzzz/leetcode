public class Solution {
    public String reverseVowels(String s) {
        if(s==null||s.length()<2){
            return s;
        }
        String v="aeiouAEIOU";
        char[] arr = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(v.indexOf(s.charAt(i))==-1){
                i++;
            }else if(v.indexOf(s.charAt(j))==-1){
                j--;
            }else{
                arr[i]=(char)(arr[i]^arr[j]);
                arr[j]=(char)(arr[i]^arr[j]);
                arr[i]=(char)(arr[i]^arr[j]);
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}