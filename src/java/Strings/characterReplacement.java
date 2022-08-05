package java.Strings;

import java.util.HashMap;
import java.util.Map;

public class characterReplacement {
    public static void main(String[] args) {
        
    }

    public int characterReplacement(String s, int k){
        char[] arr = s.toCharArray();
        int left = 0, right = 0, n =arr.length;
        Map<Character, Integer> hm = new HashMap<>();
        int maxLen = 0, mostFreq = 0;
        // find the longest repeating character replacement
        while(right < n){
            hm.put(arr[left], hm.getOrDefault(arr[right], 0) + 1);
            mostFreq = Math.max(mostFreq, hm.get(arr[right]));
            // expand windows
            if((right - left + 1) - mostFreq > k) {
                hm.put(arr[left], hm.get(arr[left] - 1 ));
                left++;
            }
            maxLen =  Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
