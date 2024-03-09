package Coding_Ninja;

import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,5,5,5};
        System.out.println(removeDuplicates(arr,arr.length));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] arr, int n) {
      int i = 1;
      int j=0;
      while(i < arr.length)
      {
          if(arr[j] == arr[i] )
          {
              i++;
          }
          else {
              arr[j] = arr[i];
              j++;
              i++;
          }
      }
      return j;
    }

}

