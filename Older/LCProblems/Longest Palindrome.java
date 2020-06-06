class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        boolean odd = false;
        int len = 0;
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                len += entry.getValue();
            } else if (odd == false) {
                len += entry.getValue();
                odd = true;
            } else {
                len += (entry.getValue())-1;
            }
        }
        return len;
    }
}