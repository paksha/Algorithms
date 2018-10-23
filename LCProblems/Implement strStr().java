/*
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        } else if (!haystack.contains(needle)) {
            return -1;
        } else {
            return haystack.indexOf(needle);
        }
    }
}