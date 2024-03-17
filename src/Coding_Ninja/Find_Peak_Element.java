package Coding_Ninja;

import java.util.ArrayList;

//https://www.codingninjas.com/studio/problems/find-peak-element_1081482?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class Find_Peak_Element {
    public static void main(String[] args) {

    }

    public static int findPeakElement(ArrayList<Integer> arr) {
        int s = 0;
        int e = arr.size() - 1;
        while (s != e) {
            int m = s + (e - s) / 2;
            if (arr.get(m) <= arr.get(m + 1)) {
                s = m + 1;
            } else if (arr.get(m) > arr.get(m + 1)) {
                e = m;
            }

        }
        return s;
    }
}
