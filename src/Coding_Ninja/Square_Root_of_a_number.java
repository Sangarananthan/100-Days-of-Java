package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/square-root-integral_893351?leftPanelTab=0%3Futm_source%3Dstriver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Square_Root_of_a_number {
    public static void main(String[] args) {

    }

    public static int sqrtN(long N) {
        long s = 1;
        long e = N;
        long ans = 0;
        while (s <= e) {
            long m = s + (e - s) / 2;
            if (m * m == N) {
                ans = m;
                break;
            } else if (m * m > N) {
                e = m - 1;
            } else {
                ans = m;
                s = m + 1;
            }
        }
        return (int) ans;
    }
}
