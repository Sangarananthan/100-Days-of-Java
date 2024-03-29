package Leetcode;

//https://leetcode.com/problems/set-mismatch/description/
public class Q645_Set_Mismatch {
    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        int i = 0;
        while (i < arr.length) {
            int check = arr[i] - 1;
            if (arr[check] != arr[i]) {
                int temp = arr[check];
                arr[check] = arr[i];
                arr[i] = temp;

            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans[0] = arr[i];
                ans[1] = i + 1;
                break;
            }
        }
        return ans;
    }
}
