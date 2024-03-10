package Leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/description/
public class Q189_Rotate_Array {
    public static void main(String[] args) {

    }

    public void rotate(int[] nums, int k) {
        if (nums.length < 2 || k == 0) {
            return;
        }
        k %= nums.length;

        int[] arr1 = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        int[] arr2 = Arrays.copyOfRange(nums, 0, nums.length - k);

        // Merge arrays using System.arraycopy
        System.arraycopy(arr1, 0, nums, 0, arr1.length);
        System.arraycopy(arr2, 0, nums, arr1.length, arr2.length);
    }
}
