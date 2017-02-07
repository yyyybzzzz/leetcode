public class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<Character>();
        Map<Character,Character>map=new HashMap<Character,Character>();
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');
        if(s.length()<=1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
            if(map.containsKey(s.charAt(i))){
                Character c=stack.pop();
                while(c!=map.get(s.charAt(i))){
                    if(map.values().contains(c)||stack.empty()){
                        return false;
                    }
                    c=stack.pop();
                }
            }
        }
        return stack.empty();
    }
}





public class Solution {
    public boolean isValid(String s) {
     Stack<Character> paren=new Stack<Character>();
        for (int i=0;i<s.length();i++) {
            Character c=s.charAt(i);
            switch (c) {
                case '(': 
                case '{': 
                case '[': paren.push(c); break;
                case ')': if (paren.empty() || paren.peek()!='(') return false; else paren.pop(); break;
                case '}': if (paren.empty() || paren.peek()!='{') return false; else paren.pop(); break;
                case ']': if (paren.empty() || paren.peek()!='[') return false; else paren.pop(); break;
                default: ; // pass
            }
        }
        return paren.empty() ;
    }
}