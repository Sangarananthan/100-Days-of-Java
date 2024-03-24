package Leetcode;
//https://leetcode.com/problems/kth-missing-positive-number/description/
public class Q1539_Kth_Missing_Positive_Number {
    public static void main(String[] args) {

    }
    public int findKthPositive(int[] arr, int k) {
        for (int i: arr) {
            if (i <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }
}
