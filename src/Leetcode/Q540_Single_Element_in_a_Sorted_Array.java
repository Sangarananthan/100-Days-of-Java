package Leetcode;

//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class Q540_Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {

    }

    public int singleNonDuplicate(int[] nums) {
        //i am trying to approach t using  2 pointer approach
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if ((nums[start] == nums[start + 1]) && (nums[end] == nums[end - 1])) {
                start = start + 2;
                end = end - 2;

            } else if (nums[start] != nums[start + 1]) {
                return nums[start];
            } else {
                return nums[end];
            }
        }
        return nums[start];
    }
}
