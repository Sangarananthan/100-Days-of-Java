package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/kth-missing-element_893215?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] arr = {4,7,9,10};
        System.out.println(missingK(arr, arr.length, 4));

    }

    public static int missingK(int[] vec, int n, int k) {
        int s = 0;
        int e = vec.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int missing = vec[mid] - (mid + 1);
            if (missing < k) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
       return s+k;
    }
}