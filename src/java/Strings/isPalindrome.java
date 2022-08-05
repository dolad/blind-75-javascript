package java.Strings;

public class isPalindrome {
    public boolean isPalindrome(String s){
        String cleanString = "";
        for(char st: s.toCharArray()){
            if(Character.isDigit(st) || Character.isLetter(st)){
                cleanString += st;
            }
        }
        cleanString.toLowerCase();
        for(int i = 0; i< cleanString.length()/2; i++){
            int left_position = i;
            int right_position = cleanString.length() - i - 1;
            if( cleanString.charAt(left_position) != cleanString.charAt(right_position)){
                return false;
            }
        }
        return true;
    }
}
