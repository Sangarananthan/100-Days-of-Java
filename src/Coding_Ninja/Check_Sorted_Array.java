package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Check_Sorted_Array {
    public static void main(String[] args) {

    }

    public static int isSorted(int n, int[] a) {
        int check = a[0];
        for (int i : a) {
            if (check <= i) {
                check = i;
            } else {
                return 0;
            }
        }
        return 1;
    }

}
