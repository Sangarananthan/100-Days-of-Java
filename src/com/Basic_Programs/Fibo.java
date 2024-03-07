package com.Basic_Programs;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.println("Enter number to find its fibo: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 2 ; i <= n ;i++)
        {
            int temp = b;
            b+=a;
            a = temp;
        }
        System.out.println(b);
    }
}
