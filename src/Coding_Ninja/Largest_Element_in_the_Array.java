package Coding_Ninja;
//https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Largest_Element_in_the_Array {
    static int largestElement(int[] arr, int n) {
        int maxi = arr[0];
        for(int i : arr)
        {
            maxi = Math.max(maxi,i);
        }
        return maxi;
    }
}
