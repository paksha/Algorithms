// Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
// Negatives do not count since -121 does not read the same backwards (121-).

// Akshay Patel

class Solution {
    public boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        int length = number.length();
        for (int i = 0, j = length-1; (i < length && i <= j); i++, j--) {
            if (number.charAt(i) != number.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}