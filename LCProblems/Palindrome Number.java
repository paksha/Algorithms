class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        int number = x;
        long val = 0;
        while (x != 0) {
            val = val*10 + x%10;
            x /= 10;
        }
        return number == (int) val;
    }
}