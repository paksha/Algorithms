class Solution {
    private boolean allZero(int[] n) {
        for (int i = 0; i < n.length; ++i) {
            if (n[i] != 0) return false;
        }
        return true;
    }
    
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;
        int[] count = new int[26];
        for (int i = 0; i < len1; ++i) {
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        if (allZero(count)) return true;
        for (int i = len1; i < len2; ++i) {
            count[s2.charAt(i)-'a']--;
            count[s2.charAt(i-len1)-'a']++;
            if (allZero(count)) return true;
        }
        return false;
    }
}