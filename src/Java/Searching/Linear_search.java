package Java.Searching;

import java.util.Arrays;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr_1 = {76, 28, 9, 93, 2, 8, 3};
        System.out.println(single_array(arr_1, 9));
        int[][] arr_2 = {
                {1, 2, 3, 5},
                {6, 7, 8, 9},
                {10, 33, 75, 14}
        };
        System.out.println(Arrays.toString(multi_dimension_array(arr_2, 14)));
    }

    public static int single_array(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static int[] multi_dimension_array(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
