package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/rotated-array_1093219?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {

    }

    public static int findMin(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (m < arr.length - 1 && arr[m] > arr[m + 1]) {
                return arr[m + 1];
            } else if (m > 0 && arr[m] < arr[m - 1]) {
                return arr[m];
            } else if (arr[s] <= arr[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return (e == arr.length - 1) ? arr[0] : arr[s + 1];
    }

}
