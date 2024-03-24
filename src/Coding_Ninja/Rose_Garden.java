package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/rose-garden_2248080?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Rose_Garden {
    public static void main(String[] args) {
        int[] arr = {15,6,4};
        System.out.println(roseGarden(arr,1,4));

    }

    public static int roseGarden(int[] arr, int k, int m) {
        int s = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;
        for (int i : arr) {
           s = Math.min(s,i);
           e = Math.max(e,i);
        }
        boolean isPossible = false;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int bouquets = calculate_bouquets(arr, mid, k);
           if(bouquets >=m)
           {
               isPossible = true;
               e = mid-1;
           }
           else {
               s = mid+1;
           }
        }
        return (isPossible)?s:-1;
    }

    public static int calculate_bouquets(int[] arr, int day, int k) {
        int count = 0;
        int flower = 0;
        for (int i : arr) {
            if (i <= day) {
                flower += 1;
                if (flower == k) {
                    flower = 0;
                    count += 1;
                }
            } else {
                flower = 0;
            }
        }
        return count;

    }
}
