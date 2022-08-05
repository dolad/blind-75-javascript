package java.Strings;

public class isAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] countarr = new int[26];
        for( int i = 0; i< s.length(); i++){
            countarr[s.charAt(i) - 'a']++;
            countarr[t.charAt(i) - 'a']--;
        }
        
        for(int j=0; j<countarr.length; j++){
            if(countarr[j] != 0) return false;
        }
        
        return true;
    }
}
