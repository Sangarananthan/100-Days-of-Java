package Coding_Ninja;

import java.util.ArrayList;

//https://www.codingninjas.com/studio/problems/rotate-array_1230543?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Rotate_array {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int rotate = k % arr.size();
        reverse(arr, 0, rotate - 1);
        reverse(arr, rotate, arr.size() - 1);
        reverse(arr, 0, arr.size() - 1);
        return arr;
    }

    public static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
}
