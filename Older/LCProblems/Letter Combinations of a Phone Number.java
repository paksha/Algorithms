class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<String>();
        if (digits.length() == 0) return result;
        String[] t9 = new String[] {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        result.add("");
        for (int i = 0; i < digits.length(); ++i) {
            int x = digits.charAt(i) - '0';
            while (result.peek().length() == i) {
                String ans = result.remove();
                for (char s : t9[x].toCharArray()) result.add(ans+s);
            }
        }
        return result;
    }
}