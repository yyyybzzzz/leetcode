public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map s_m=new HashMap();
        Map t_m=new HashMap();
        if(s.length()!=t.length()){
            return false;
        }else{
            for(int i=0;i<s.length();i++){
                if(!s_m.containsKey(s.charAt(i))&&!t_m.containsKey(t.charAt(i))){
                    s_m.put(s.charAt(i),i);
                    t_m.put(t.charAt(i),i);
                }else if(s_m.containsKey(s.charAt(i))&&t_m.containsKey(t.charAt(i))){
                    if(s_m.get(s.charAt(i))==t_m.get(t.charAt(i))){
                        
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}