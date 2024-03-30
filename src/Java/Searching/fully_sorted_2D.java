package Java.Searching;

import java.util.Arrays;

public class fully_sorted_2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(search(arr, 5)));
    }

    public static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        if (rows == 1) {
            return binary(arr, 0, 0, cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        } else if (arr[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        } else if (target < arr[rStart][cMid]) {
            return binary(arr,rStart,0,cMid-1,target);
        } else if (target > arr[rStart][cMid] && target < arr[rStart+1][0]) {
            return binary(arr,rStart,cMid+1,arr[rStart].length-1,target);
        } else if (target < arr[rStart+1][cMid]) {
            return binary(arr,rStart+1,0,cMid-1,target);
        } else {
            return binary(arr,rStart+1,cMid+1,arr[rStart+1].length-1,target);
        }
    }

    public static int[] binary(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            } else if (arr[row][mid] > target) {
                cEnd = mid - 1;
            } else {
                cStart = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}
