package Leetcode;

//https://leetcode.com/problems/find-the-duplicate-number/description/
public class Q287_Find_the_Duplicate_Number {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {
        boolean n[] = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (n[nums[i]]) return nums[i];

            n[nums[i]] = true;
        }
        return -1;
    }
}
class Solution1 {
    public int findDuplicate1(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int check = nums[i] - 1;
            if (nums[i] != i + 1) {
                if (nums[i] != nums[check]) {
                    int temp = nums[i];
                    nums[i] = nums[check];
                    nums[check] = temp;
                } else return nums[check];
            } else
                i++;
        }

        return -1;
    }
}
