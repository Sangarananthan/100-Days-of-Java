package Leetcode;
//https://leetcode.com/problems/find-peak-element/description/
public class Q162_Find_Peak_Element {
    public static void main(String[] args) {

    }
    public int findPeakElement(int[] arr) {
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
