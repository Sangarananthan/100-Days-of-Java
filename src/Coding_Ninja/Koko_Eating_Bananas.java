package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/minimum-rate-to-eat-bananas_7449064?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Koko_Eating_Bananas {
    public static void main(String[] args) {
         int[] arr = {3,6,8,2};
         int h= 8;
        System.out.println(minimumRateToEatBananas(arr,h));
    }
    public static int minimumRateToEatBananas(int[] v, int h) {
        int s = 1;
        int e = maxi(v);
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int hours = calculate_hours(v, mid);
           if (hours <= h) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
    public static int calculate_hours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }
    public static int maxi(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = Math.max(sum,i);
        }
        return sum;
    }
}
