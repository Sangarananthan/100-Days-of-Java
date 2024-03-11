package Java.Concepts;

import java.util.Arrays;

public class Arrrays {
    public static void main(String[] args) {
        int[] arr = new int[8];
        System.out.println(
                Arrays.toString(arr)
        );

        int[][] array = new int[3][3];
        for(int[] i: array)
        {
            System.out.println(Arrays.toString(i));
        }
    }
}
