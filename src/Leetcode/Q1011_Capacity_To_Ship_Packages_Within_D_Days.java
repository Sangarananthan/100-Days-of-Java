package Leetcode;

//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
public class Q1011_Capacity_To_Ship_Packages_Within_D_Days {
    public static void main(String[] args) {

    }

    public int shipWithinDays(int[] weights, int days) {
        int s = weights[0];
        int e = 0;
        for (int i : weights) {
            s = Math.max(s, i);
            e += i;
        }
        while (s < e) {
            int mid = s + (e - s) / 2;
            int sum = 0;
            int pieces = 1;
            for (int i : weights) {
                if (sum + i <= mid) {
                    sum += i;
                } else {
                    pieces++;
                    sum = i;
                }
            }
            if (pieces <= days) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
}