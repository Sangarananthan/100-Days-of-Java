package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/ninja-and-the-zero-s_6581958?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Move_Zeros_to_End {
    public static void main(String[] args) {

    }
    public static int[] moveZeros(int n, int[] a) {
        int start = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] != 0) {
                a[start] = a[i];
                start += 1;
            }
            i++;
        }
        while (start < a.length) {
            a[start] = 0;
            start++;
        }
        return a;
    }
}
