package Leetcode;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class Q153_Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {

    }

    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s != e) {
            int m = s + (e - s) / 2;
            if (m < nums.length - 1 && nums[m] > nums[m + 1]) {
                return nums[m + 1];
            } else if (m > 0 && nums[m] < nums[m - 1]) {
                return nums[m];
            } else if (nums[s] <= nums[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return (e == nums.length - 1) ? nums[0] : nums[s + 1];
    }
}
