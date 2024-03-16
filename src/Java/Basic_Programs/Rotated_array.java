package Java.Basic_Programs;

public class Rotated_array {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8,9,10, 1, 2, 3, 4};
        int peak = peak(arr);
        System.out.println("peak element in rotated array is " + peak);
    }

    public static int peak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s != e) {
            int m = s + (e - s) / 2;
            if(arr[m] > arr[m+1])
                return arr[m];
            else if(arr[m] < arr[m-1])
                return arr[m-1];
            else if(arr[s] >= arr[m])
                e = m-1;
            else if(arr[s] <= arr[m])
                s = m+1;
        }
        return arr[s];
    }
}
