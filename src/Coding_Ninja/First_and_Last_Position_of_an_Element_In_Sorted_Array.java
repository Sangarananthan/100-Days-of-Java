package Coding_Ninja;
//https://www.codingninjas.com/studio/problems/first-and-last-position-of-an-element-in-sorted-array_1082549?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSIONimport java.util.ArrayList;
import java.util.*;

public class First_and_Last_Position_of_an_Element_In_Sorted_Array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        System.out.println(Arrays.toString(firstAndLastPosition(arr,arr.size(),2)));

    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = binary(arr, n, k, true);
        int last = binary(arr, n, k, false);
        return new int[]{first, last};
    }

    public static int binary(ArrayList<Integer> arr, int n, int k, boolean isFirst) {
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr.get(m) == k) {
                ans = m;
                if (isFirst) {
                    e = m-1;
                } else {
                   s = m + 1;
                }
            } else if (arr.get(m) < k) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}
