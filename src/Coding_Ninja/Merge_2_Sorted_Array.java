package Coding_Ninja;

import java.util.ArrayList;
import java.util.List;

//https://www.codingninjas.com/studio/problems/sorted-array_6613259?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class Merge_2_Sorted_Array {
    public static void main(String[] args) {

    }

    public static List<Integer> sortedArray(int[] a, int[] b) {
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }
        }
        while (i < a.length) {
            if (union.get(union.size() - 1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }
        while (j < b.length) {
            if (union.get(union.size() - 1) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }
}
