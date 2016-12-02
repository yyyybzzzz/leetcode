public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>list=new ArrayList<Integer>();
        if(s.length()<p.length()){
            return list;
        }
        int [] hs=new int[256];
        int [] hp=new int[256];
        int len=p.length();
        int slen=s.length();
        for(int i=0;i<len;i++){
            hp[p.charAt(i)]++;
            hs[s.charAt(i)]++;
        }
        for(int i=0;i<=slen-len;i++){
            if(Arrays.equals(hp,hs)){
                list.add(i);
            }
            if(i==slen-len){
                break;
            }
            hs[s.charAt(i)]--;
            hs[s.charAt(i+len)]++;
        }
        return list;
    }
}