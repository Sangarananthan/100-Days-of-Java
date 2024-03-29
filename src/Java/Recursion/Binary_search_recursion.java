package Java.Recursion;

public class Binary_search_recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(search(arr, 8, 0, arr.length - 1));
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        } else {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                return m;
            } else if (arr[m] > target) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }
    }
}
