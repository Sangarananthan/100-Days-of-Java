package Leetcode;

//https://leetcode.com/problems/missing-number/description/
public class Q268_Missing_Number {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int check = nums[i];
            if (check < nums.length && nums[check] != nums[i]) {
                int temp = nums[check];
                nums[check] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (i != nums[i])
                return i;
        }
        return nums.length;
    }
}
