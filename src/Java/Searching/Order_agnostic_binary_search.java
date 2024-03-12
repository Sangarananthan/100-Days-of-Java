package Java.Searching;

public class Order_agnostic_binary_search {
    public static void main(String[] args) {
        int[] arr = {50, 34, 21, 14, 11, 8, 6, 3, 2, 1};
        System.out.println(binarySearch(arr, 1));
    }

    public static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length;
        boolean isDesc = arr[s] < arr[e - 1];
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target)
                return mid;
            else if (isDesc) {
                if (arr[mid] < target) {
                    s = mid + 1;
                } else if (arr[mid] > target) {
                    e = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    s = mid + 1;
                } else if (arr[mid] < target) {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
