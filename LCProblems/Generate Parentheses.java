class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        backtrack(result, n, 0, "");
        return result;
    }
    private void backtrack(List<String> result, int o, int c, String curr) {
        if (o == 0 && c == 0) {
            result.add(curr);
            return;
        }
        if (o > 0) backtrack(result, o-1, c+1, curr + "(");
        if (c > 0) backtrack(result, o, c-1, curr + ")");
    }
}