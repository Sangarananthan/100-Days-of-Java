package Java.Basic_Programs;

public class Ceiling_and_Floor {
    public static void main(String[] args) {
        int[] arr = {3,4,47,8,10};
        System.out.println(ceiling(arr, 2));
        System.out.println(floor(arr, 2));
    }

    public static int ceiling(int[] arr, int n) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == n)
                return n;
            else if (arr[m] < n)
                s = m + 1;
            else
                e = m - 1;
        }
        if (s >= arr.length)
            return -1;
        return arr[s];
    }

    public static int floor(int[] arr, int n) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == n)
                return n;
            else if (arr[m] < n)
                s = m + 1;
            else
                e = m - 1;
        }
        if(e < 0)
            return -1;

        return arr[e];
    }
}
