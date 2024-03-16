package Leetcode;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class Q744_Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {

    }
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (letters[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return letters[s % letters.length];
    }
}
