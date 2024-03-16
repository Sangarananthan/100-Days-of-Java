package Java.Basic_Programs;

public class Rotated_array_with_duplicates {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3,4,2,2,2,2};
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
           else if(arr[s] == arr[m] && arr[m] ==arr[e])
            {
                if(arr[s]>arr[s+1])
                    return arr[s];
                s++;
                if(arr[e] < arr[e-1])
                    return arr[e-1];
                e--;
            }
           else if(arr[s] < arr[m] ||(arr[s] == arr[m] && arr[m] > arr[e]))
            {
                s = m+1;
            }
           else
            {
                e = m-1;
            }
        }
        return arr[s];
    }
}
