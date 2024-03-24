package Coding_Ninja;
//https://www.codingninjas.com/studio/problems/aggressive-cows_1082559?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

import java.util.Arrays;

public class Aggressive_Cows {
    public static void main(String[] args) {
        int[] arr = {87, 93, 51, 81, 68, 99, 59};
        System.out.println(aggressiveCows(arr, 4));
    }

    public static int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int start = 1;
        int end = arr[arr.length - 1] - arr[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int position = 0;
            int cows = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == 0 || arr[i] - arr[position] >= mid) {
                    position = i;
                    cows++;
                }
            }
            if (cows >= k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
