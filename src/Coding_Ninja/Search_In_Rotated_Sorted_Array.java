package Coding_Ninja;

import java.util.ArrayList;

//https://www.codingninjas.com/studio/problems/search-in-rotated-sorted-array_1082554?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Search_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(7);
//        arr.add(8);
//        arr.add(9);
//        arr.add(10);
//        arr.add(0);
        arr.add(1);
        arr.add(2);
//        arr.add(3);
        System.out.println(search(arr,arr.size(),2));
    }

    public static int search(ArrayList<Integer> arr, int n, int k) {
        int peak = peak(arr, n);
        return (k >= arr.get(0)) ? binary(arr, k, n, 0, peak) : binary(arr, k, n, peak + 1, n - 1);

    }

    public static int binary(ArrayList<Integer> arr, int target, int n, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr.get(m) == target) {
                return m;
            } else if (arr.get(m) < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }

    public static int peak(ArrayList<Integer> arr, int n) {
        int s = 0;
        int e = n - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (m < n-1 && arr.get(m) > arr.get(m + 1)) {
                return m;
            } else if (m > 0 && arr.get(m) < arr.get(m - 1)) {
                return m - 1;
            } else if (arr.get(s) <= arr.get(m)) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return s;
    }

}
