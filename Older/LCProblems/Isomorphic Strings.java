/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.
*/

import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] s1 = new int[256];
        int[] t1 = new int[256];
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            if (s1[s.charAt(i)] != t1[t.charAt(i)]) {
                return false;
            }
            s1[s.charAt(i)] = i+1;
            t1[t.charAt(i)] = i+1;
        }
        return true;
    }
}