package Leetcode;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class Q34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{search(nums, true, target), search(nums, false, target)};
    }

    public static int search(int[] nums, boolean isFirst, int target) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                ans = m;
                if (isFirst) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else if (nums[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }

}
