package Leetcode;
//https://leetcode.com/problems/search-insert-position/description/
public class Q35_Search_Insert_Position {
    public static void main(String[] args) {

    }
    public static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target)
                return m;
            else if (nums[m] > target)
                e = m - 1;
            else
                s = m + 1;
        }
        return s;
    }
}
