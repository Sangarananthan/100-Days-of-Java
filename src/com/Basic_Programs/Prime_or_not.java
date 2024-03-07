package com.Basic_Programs;

import java.util.Scanner;

public class Prime_or_not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
