
import java.util.HashMap;
import java.util.Map;

class Solution {

    // // sliding window
    // public int lengthOfLongestSubstring(String s) {
    //     Map<Character, Integer> c;
    //     int res = 0;
    //     int count;
    //     for (int i = 0; i < s.length(); i++) {
    //         count = 0;
    //         c = new HashMap<>();
    //         for (int j = i; j < s.length(); j++) {
    //             if (!c.containsKey(s.charAt(j))) {
    //                 count += 1;
    //                 c.put(s.charAt(j), c.getOrDefault(s.charAt(j), 0) + 1);
    //                 if (res < count) {
    //                     res = count;
    //                 }
    //             } else {
    //                 break;
    //             }
    //         }
    //     }
    //     return res;
    // }
    /*
    sliding window
    Time complexity: O(n)
    Space complexity: O(1)
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> c = new HashMap<>();
        int res = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            c.put(ch, c.getOrDefault(ch, 0) + 1);

            while (c.get(ch) > 1) { // unitl its unique
                char newch = s.charAt(j);
                c.put(newch, c.get(newch) - 1);
                j += 1;
            }
            res = Math.max(res, i - j + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.lengthOfLongestSubstring("abcabcbb"));
    }
}
