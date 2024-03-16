package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class implement_Upper_Bound {
    public static void main(String[] args) {

    }

    public static int upperBound(int[] arr, int x, int n) {
        if (arr[n - 1] < x) {
            return n;
        }
        int s = 0;
        int e = n - 1;
        int ans = n;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] > x) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }
}
