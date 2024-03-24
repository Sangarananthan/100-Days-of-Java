package Coding_Ninja;
//https://www.codingninjas.com/studio/problems/smallest-divisor-with-the-given-limit_1755882?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Smallest_divisor {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5};
        System.out.println(smallestDivisor(arr,8));
    }
    public static int smallestDivisor(int arr[], int limit) {
        int s = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;
        for(int i : arr)
        {
            s = Math.min(s,i);
            e = Math.max(e,i);
        }
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            int sum = calculate_sum(arr,mid);
            if(sum <= limit)
            {
                e = mid-1;
            }
            else
            {
                s = mid+1;
            }
        }
        return s;
    }
    public static int calculate_sum(int[] arr, int div) {
        int total = 0;
        for (int i : arr) {
            total += (int) Math.ceil((double) i / div);
        }
        return total;
    }
}
