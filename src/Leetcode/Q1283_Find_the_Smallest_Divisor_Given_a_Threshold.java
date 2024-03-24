package Leetcode;

//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/
public class Q1283_Find_the_Smallest_Divisor_Given_a_Threshold {
    public static void main(String[] args) {
        int[] arr = {19};
        System.out.println(smallestDivisor(arr, 5));
    }

    public static int smallestDivisor(int[] arr, int limit) {
        long tot = 0;
        int s = 1;
        int e = Integer.MIN_VALUE;
        for (int i : arr) {
//            s = Math.min(s, i);
            e = Math.max(e, i);
            tot += i;
        }
        if (tot <= limit) {
            return 1;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            long sum = calculate_sum(arr, mid);
            if (sum <= limit) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    public static long calculate_sum(int[] arr, int div) {
        long total = 0;
        for (int i : arr) {
            total += (int) Math.ceil((double) i / div);
        }
        return total;
    }
}


