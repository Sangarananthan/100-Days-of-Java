package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/left-rotate-an-array-by-one_5026278?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Left_Rotate_an_Array_by_One {
    public static void main(String[] args) {

    }
    static int[] rotateArray(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        return arr;
    }
}
