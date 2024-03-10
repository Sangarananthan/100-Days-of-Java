package Leetcode;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class Q26_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int ans = 1;
        int i = 0 ;
        int dup = 0;
        while(i < nums.length)
        {
            if(nums[dup] != nums[i])
            {
                dup+=1;
                nums[dup] = nums[i];
            }
            i++;
        }
        return dup+1;
    }
}
