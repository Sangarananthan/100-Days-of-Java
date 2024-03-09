package Leetcode;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class Q1672_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] i : accounts) {
            int sum = 0;
            for (int j : i) {
                sum += j;
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
