package Leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class Q448_Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < arr.length) {
            int check = arr[i] - 1;
            if (check < arr.length && arr[check] != arr[i]) {
                int temp = arr[check];
                arr[check] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}
