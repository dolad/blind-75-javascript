package java.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupedAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String current: strs){
            char[] characters = current.toCharArray();
            Arrays.sort(characters);
            String sortedString = new String(characters);
        
        if(!map.containsKey(sortedString)){
            map.put(sortedString, new ArrayList<>());
        }
        map.get(sortedString).add(current);   
    }
    groupedAnagrams.addAll(map.values());
    return groupedAnagrams;
    }
}
