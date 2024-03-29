package Java.Recursion;

public class linear_search_recursion {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 75, 11, 91, -12, 45, 6};
        System.out.println(linear(arr, 1, 0));
    }
    public static int linear(int[] arr, int target, int s) {
        if (s == arr.length) {
            return -1;
        } else if (arr[s] == target) {
            return s;
        } else {
            return linear(arr, target, ++s);
        }
    }
}
