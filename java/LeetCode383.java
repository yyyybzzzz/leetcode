public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> note = new HashMap<Character, Integer>();
		Map<Character, Integer> mag = new HashMap<Character, Integer>();
		for (int i = 0; i < ransomNote.length(); i++) {
			if (note.containsKey(ransomNote.charAt(i))) {
				note.put(ransomNote.charAt(i), note.get(ransomNote.charAt(i)) + 1);
			} else {
				note.put(ransomNote.charAt(i), 1);
			}
		}
		for (int i = 0; i < magazine.length(); i++) {
			if (mag.containsKey(magazine.charAt(i))) {
				mag.put(magazine.charAt(i), mag.get(magazine.charAt(i)) + 1);
			} else {
				mag.put(magazine.charAt(i), 1);
			}
		}
		for (char key : note.keySet()) {
			if (!mag.containsKey(key)||mag.get(key) < note.get(key)) {
			    return false;
			} 
		}
		return true;
	}
}
//第二种方法  效率较高
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
	int[] arr = new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            char c = magazine.charAt(i);
            arr[c-'a']++;
        }
        
        for(int i=0;i<ransomNote.length();i++)
        {
            char c = ransomNote.charAt(i);
            arr[c-'a']--;
            if(arr[c-'a']<0) return false;
        }
        
        return true;
	}
}
