/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
*/


class Solution {
    private boolean allsame(String[] strs, int index, int length, int leastlengthofstring, int indexofshortest) {
        boolean same = true;
        if (index > leastlengthofstring - 1) {
            return false;
        }
        String n = String.valueOf(strs[0].charAt(index));
        for (int i = 0; i < length; i++) {
            if (!String.valueOf(strs[i].charAt(index)).equals(n)) {
                same = false;
                break;
            }
        }
        return same;
    }
    public String longestCommonPrefix(String[] strs) {
        String pref = "";
        int length = strs.length;
        if (length == 0) {
            return pref;
        }
        int i = 0;
        int leastlengthofstring = strs[0].length();
        int indexofshortest = 0;
        for (int j = 0; j < length; j++) {
            if (strs[j].length() < leastlengthofstring) {
                leastlengthofstring = strs[j].length();
                indexofshortest = j;
            }
        }
        while (allsame(strs, i, length, leastlengthofstring, indexofshortest)) {
            pref = pref+String.valueOf(strs[0].charAt(i));
            i++;
        }
        return pref;
    }
}