class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> st = new HashMap<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (st.containsKey(c)) {
                count = Math.max(count, st.get(c));
            }
            max = Math.max(max, i-count+1);
            st.put(c, i+1);
        }
        return max;
    }
}