package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/linear-search_6922070?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class Linear_Search {
    public static void main(String[] args) {

    }

    public static int linearSearch(int n, int num, int[] arr) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
