package Leetcode;
//https://leetcode.com/problems/binary-search/
public class Q704_Binary_Search {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return -1;
    }
}
