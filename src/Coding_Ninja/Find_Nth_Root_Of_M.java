package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/nth-root-of-m_1062679?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Find_Nth_Root_Of_M {
    public static void main(String[] args) {

    }

    public static int NthRoot(int n, int m) {
        int s = 0;
        int e = m;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int ans = (int) Math.pow(mid, n);
            if (ans == m) {
                return mid;
            } else if (ans > m) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
