package Java.Searching;

public class infinite_array_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 17, 21, 45, 67, 69, 71, 75, 79, 83, 89, 90, 100};
        ans(arr, 2);
    }
    public static void ans(int[] arr, int target) {
        int s = 0;
        int e = 1;
        while (arr[e] < target) {
            int temp = e + 1;
            e += (e - s + 1) * 2;
            s = temp;
        }
        System.out.println(binarySearch(arr, target, s, e));
    }
    public static int binarySearch(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < target) {
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else
                return mid;
        }
        return -1;
    }
}
