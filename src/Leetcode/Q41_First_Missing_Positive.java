package Leetcode;

//https://leetcode.com/problems/first-missing-positive/description/
public class Q41_First_Missing_Positive {
    public static void main(String[] args) {

    }

    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int check = arr[i] - 1;
            if (check >= 0 && check < arr.length && arr[check] != arr[i]) {
                int temp = arr[check];
                arr[check] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr.length + 1;
    }
}
