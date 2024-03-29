package Leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class Q442_Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        boolean[] n = new boolean[nums.length+1];
        for(int i : nums)
        {
            if(n[i])
            {
                ans.add(i);
            }
            n[i] = true;
        }
        return ans;
    }
}
