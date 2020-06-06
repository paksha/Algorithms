/*
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.
*/

import java.util.*;
class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<Character>();
        int jewels = 0;
        int length = J.length();
        int length_2 = S.length();
        for (int i = 0; i < length; ++i) {
            char c = J.charAt(i);
            set.add(c);
        }
        for (int j = 0; j < length_2; ++j) {
            char b = S.charAt(j);
            if (set.contains(b)) {
                jewels++;
            }
        }
        return jewels;
    }
}