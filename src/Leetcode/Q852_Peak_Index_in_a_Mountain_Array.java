package Leetcode;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Q852_Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s != e) {
            int m = s + (e - s) / 2;
            if (arr[m] <= arr[m + 1]) {
                s = m + 1;
            }
            if (arr[m] > arr[m + 1]) {
                e = m;
            }
        }
        return s;
    }
}
