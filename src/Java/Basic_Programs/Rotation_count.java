package Java.Basic_Programs;

public class Rotation_count {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,-5,-3,-2,1};
        int rotation = rotation_count(arr);
        System.out.println("The array is rotated by: " + rotation + " times");
    }

    private static int rotation_count(int[] arr) {
        int pivot = peak(arr);
        return (pivot+1);

    }

    public static int peak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m + 1])
                return m;
            else if (arr[m] < arr[m - 1])
                return m - 1;
            else if (arr[s] == arr[m] && arr[m] == arr[e]) {
                if (arr[s] > arr[s + 1])
                    return s;
                s++;
                if (arr[e] < arr[e - 1])
                    return e - 1;
                e--;
            } else if (arr[s] < arr[m] || (arr[s] == arr[m] && arr[m] > arr[e])) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        return s;
    }
}
