package Coding_Ninja;

import java.util.ArrayList;

//https://www.codingninjas.com/studio/problems/unique-element-in-sorted-array_1112654?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {

    }

    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans ^= arr.get(i);
        }
        return ans;
    }
}
