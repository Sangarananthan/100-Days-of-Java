package Java.Sorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {-1, -5, 0, 0, 1, 3, 5, 21, 66, 32, -76};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[max];
            arr[max] = temp;
        }
    }
}
