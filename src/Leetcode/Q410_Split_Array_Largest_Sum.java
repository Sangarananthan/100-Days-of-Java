package Leetcode;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class Q410_Split_Array_Largest_Sum {
    public static void main(String[] args) {

    }

    public static int splitArray(int[] nums, int k) {
        int s = nums[0];
        int e = 0;
        for (int i : nums) {
            s = Math.max(s, i);
            e += i;
        }
        while (s < e) {
            int mid = s + (e - s) / 2;
            int sum = 0;
            int pices = 1;
            for (int i : nums) {
                if (sum + i <= mid) {
                    sum += i;
                } else {
                    pices++;
                    sum = i;
                }
            }
            if (pices <= k) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
}
