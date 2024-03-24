package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/capacity-to-ship-packages-within-d-days_1229379?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Capacity_To_Ship_Packages_Within_D_Days {
    public static void main(String[] args) {
        int[] arr= {5,4,5,2,3,4,5,6};
        System.out.println(leastWeightCapacity(arr,5));
    }

    public static int leastWeightCapacity(int[] weights, int d) {
        int s = Integer.MIN_VALUE;
        int e = 0;
        for (int i : weights) {
            s = Math.max(s, i);
            e += i;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int days = calculate_days(weights, mid);
            if (days <= d) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    public static int calculate_days(int[] arr, int capacity) {
        int days = 1;
        int sum = 0;
        for (int i : arr) {
            if (sum + i <= capacity) {
                sum += i;
            } else {
                days += 1;
                sum = i;
            }
        }
        return days;
    }
}