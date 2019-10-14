// One pass solution to optimize for very long strings
class Pair {
    public int x;
    public int y;
    
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Pair> counts = new LinkedHashMap<>();
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (counts.containsKey(c)) {
                Pair update = new Pair(counts.get(c).x+1,counts.get(c).y);
                counts.put(c, update);
            } else {
                counts.put(c, new Pair(1, j));
            }
        }
        for (Pair val : counts.values()) {
            if (val.x == 1) {
                return val.y;
            }
        }
        return -1;
    }
}