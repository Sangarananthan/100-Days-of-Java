package Coding_Ninja;
//https://www.codingninjas.com/studio/problems/lower-bound_8165382?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Implement_Lower_Bound {
    public static void main(String[] args) {
       int[] arr = {1,2,2,3,4};
        System.out.println(lowerBound(arr,arr.length,0));
    }
    public static int lowerBound(int []arr, int n, int x) {
        if(x <= arr[0])
            return 0;
        int s = 0;
        int e = n-1;
        int ans = n;
        while(s <= e)
        {
            int m = s+(e-s)/2;
            if(arr[m] >= x)
            {
                ans = m;
                e = m-1;
            }
            else if(arr[m] < x){
                s = m+1;
            }
        }
        return ans;
    }
}
