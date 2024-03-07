package Coding_Ninja;

import java.util.Scanner;

//https://www.codingninjas.com/studio/problems/yogesh-and-primes_16331?interviewProblemRedirection=true
public class Yogesh_and_Primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int K = in.nextInt();
        int count = 0;

        for (int i = A; i <= B; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                count++;
            if (count == K) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
