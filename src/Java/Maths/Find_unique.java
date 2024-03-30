package Java.Maths;

public class Find_unique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 1, 5, 1, 4, 5, 4, 6,2};
        System.out.println(unique(arr));
    }

    public static int unique(int[] arr) {
        int ans = 0;
        for (int i : arr) {
            ans ^= i;
        }
        return ans;
    }
}
