package Coding_Ninja;

import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Second_Largest_Number {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSecondOrderElements(4,new int[]{3,10,12,14,5})));
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        int secondLargest = secondlargest(a);
        int secondSmallest = secondsmallest(a);
        return new int[]{secondLargest, secondSmallest};
    }

    public static int secondlargest(int[] arr) {
        int first = arr[0];
        int second = Integer.MIN_VALUE;
        for (int i : arr) {
            if (first < i) {
                second = first;
                first = i;
            } else if (i < first && i > second) {
                second = i;
            }
        }
        return second;
    }

    public static int secondsmallest(int[] arr) {
        int first = arr[0];
        int second = Integer.MAX_VALUE;
        for (int i : arr) {
            if (first > i) {
                second = first;
                first = i;
            } else if (i > first && i < second) { // Add this condition to update second smallest
                second = i;
            }
        }
        return second;
    }
}
