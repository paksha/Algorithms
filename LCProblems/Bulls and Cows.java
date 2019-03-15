/*
Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows. 

Please note that both secret number and friend's guess may contain duplicate digits.

Example 1:

Input: secret = "1807", guess = "7810"

Output: "1A3B"

Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
Example 2:

Input: secret = "1123", guess = "0111"

Output: "1A1B"

Explanation: The 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow.
Note: You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
*/

class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] counts = new int[10];
        for (int i = 0; i < secret.length(); ++i) {
            counts[secret.charAt(i)-'0']++;
        }
        for (int j = 0; j < secret.length(); ++j) {
            if (secret.charAt(j) == guess.charAt(j)) {
                bulls++;
                counts[secret.charAt(j)-'0']--;
            }
        }
        for (int j = 0; j < secret.length(); ++j) {
            if (secret.charAt(j) != guess.charAt(j) && counts[guess.charAt(j)-'0'] > 0) {
                cows++;
                counts[guess.charAt(j)-'0']--;
            }
        }
        String result = "" + bulls + "A" + cows + "B";
        return result;
    }
}