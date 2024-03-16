package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/binary-search_972?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class Binary_Search {
    public static void main(String[] args) {

    }

    public static int search(int[] nums, int target) {
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
        return -1;

    }
}
