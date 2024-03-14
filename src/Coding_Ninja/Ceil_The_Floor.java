package Coding_Ninja;

import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401?leftPanelTabValue=SOLUTION
public class Ceil_The_Floor {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        System.out.println(Arrays.toString(getFloorAndCeil(arr, 9, 7)));
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        Arrays.sort(a);
        int ceil;
        int floor;
        int s = 0;
        int e = a.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (a[m] == x)
                return new int[]{x, x};
            else if (a[m] > x)
                e = m - 1;
            else
                s = m + 1;
        }
        ceil = (s < a.length) ? a[s] : -1;
        floor = (e == -1) ? -1 : a[e];
        return new int[]{ceil, floor};
    }

}
