package Leetcode;

//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
public class Q1482_Minimum_Number_of_Days_to_Make_m_Bouquets {
    public static void main(String[] args) {

    }
    public int minDays(int[] arr, int m, int k) {
        if (((long) k * m) > arr.length) return -1;
        int s = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;
        for (int i : arr) {
            s = Math.min(s, i);
            e = Math.max(e, i);
        }
        boolean isPossible = false;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int bouquets = calculate_bouquets(arr, mid, k);
            if (bouquets >= m) {
                isPossible = true;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return (isPossible) ? s : -1;
    }

    public static int calculate_bouquets(int[] arr, int day, int k) {
        int count = 0;
        int flower = 0;
        for (int i : arr) {
            if (i <= day) {
                flower += 1;
                if (flower == k) {
                    flower = 0;
                    count += 1;
                }
            } else {
                flower = 0;
            }
        }
        return count;

    }
}
