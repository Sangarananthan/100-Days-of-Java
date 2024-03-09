package Leetcode;
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class Q1752_Check_if_Array_Is_Sorted_and_Rotated {
    public static void main(String[] args) {
        System.out.println(check(new int[]{3,4,5,1,2,6}));
    }
    public static boolean check(int[] nums) {
        int n = nums.length;
        boolean rotated = false;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (rotated) {
                    return false;
                }
                rotated = true;
            }
        }

        if (rotated && nums[n - 1] > nums[0]) {
            return false;
        }

        return true;
    }
}
