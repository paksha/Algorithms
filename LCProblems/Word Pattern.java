/*
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true
Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.


*/

import java.lang.String;
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] letters = new String[26];
        String[] parts = str.split(" ");
        HashSet<String> words = new HashSet<>();
        if (parts.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); ++i) {
            int currchar = (Integer.valueOf(pattern.charAt(i)))-97;
            if (letters[currchar] == null) {
                letters[currchar] = parts[i];
                if (words.contains(parts[i])) {
                    return false;
                } else {
                    words.add(parts[i]);
                }
            } else {
                if (!(parts[i]).equals(letters[currchar])) return false;
            }
        }
        return true;
    }
}