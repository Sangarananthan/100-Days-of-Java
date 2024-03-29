package Java.Sorting;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,1,6};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclic(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int check = arr[i]-1;
            if(arr[check] != arr[i])
            {
                int temp = arr[check];
                arr[check] = arr[i];
                arr[i] = temp;
            }
            else {
                i++;
            }
        }
    }
}
