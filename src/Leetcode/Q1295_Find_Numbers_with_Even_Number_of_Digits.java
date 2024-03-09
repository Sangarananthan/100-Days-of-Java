package Leetcode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class Q1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] arr = {12, 34, 2, 6, 7896};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            int digits = (int) (Math.log10(i)) + 1;
            count += ((digits & 1) == 1) ? 0 : 1;
        }
        return count;
    }
}
