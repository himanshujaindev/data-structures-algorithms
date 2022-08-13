package QuickCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode {

    public static boolean fn(int wordLen, HashMap<String, Integer> wordCount, String s) {
        
        HashMap<String, Integer> copyWc = new HashMap<>();
        copyWc.putAll(wordCount);

        for(int i=0; i<s.length(); i+=wordLen) {
            String str = s.substring(i, i+wordLen);
            if(copyWc.containsKey(str)) {
                if(copyWc.get(str) > 0) {
                    copyWc.put(str, copyWc.get(str)-1);
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        
        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String w: words) {
            if(wordCount.containsKey(w)) {
                wordCount.put(w, wordCount.get(w) + 1);
            }
            else{
                wordCount.put(w, 1);
            }
        }

        int wordLen = words[0].length();
        int substringSize = wordLen*words.length;
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<s.length()-substringSize+1; i++){
            String substr = s.substring(i, i+substringSize);
            boolean res = fn(wordLen, wordCount, substr);
            if(res) {
                result.add(i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String[] words = {"foo","bar"};
        List<Integer> res = findSubstring("barfoothefoobarman", words);
        System.out.println(res.toString());
    }
}

