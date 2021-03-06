/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.
*/

// Akshay Patel

class Solution {
    public boolean isValid(String s) {
        Stack stacks = new Stack();
        int length = s.length();
        String open = "({[";
        for (int i = 0; i < length; i++) {
            if (open.indexOf(s.charAt(i)) != -1) {
                stacks.push(s.charAt(i));
            } else if (stacks.empty() && !(open.indexOf(s.charAt(i)) != -1)) {
                return false;
            } else {
                if ((s.charAt(i) == ')' && (Character) stacks.peek() == '(') ||
                   (s.charAt(i) == '}' && (Character) stacks.peek() == '{') ||
                   (s.charAt(i) == ']' && (Character) stacks.peek() == '[')) {
                    stacks.pop();
                } else {
                    return false;
                }
            }
        }
        return stacks.empty();
    }
}
