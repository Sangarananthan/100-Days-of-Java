package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/rotation_7449070?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Rotation {
    public static void main(String[] args) {
        int[] arr = {27, 31, 43, 45, 46, 5, 11, 13, 18, 19, 20};
        System.out.println(findKRotation(arr));
    }


    public static int findKRotation(int[] arr) {
        int pivot = rotaion(arr, arr.length);
        if (pivot + 1 == arr.length) {
            return 0;
        }
        return pivot + 1;
    }

    public static int rotaion(int[] arr, int n) {
        int s = 0;
        int e = n - 1;
        while (s != e) {
            int m = s + (e - s) / 2;
            if (m < arr.length - 1 && arr[m] > arr[m + 1]) {
                return m;
            } else if (m > 0 && arr[m] < arr[m - 1]) {
                return m-1;
            } else if (arr[s] <= arr[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return s;
    }
}
