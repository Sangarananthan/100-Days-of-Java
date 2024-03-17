package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/occurrence-of-x-in-a-sorted-array_630456?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Number_of_occurrence {
    public static void main(String[] args) {

    }

    public static int count(int arr[], int n, int x) {
        int first = search(arr, true, x);
        if (first == -1) {
            return 0;
        }
        int last = search(arr, false, x);
        return last - first + 1;
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
