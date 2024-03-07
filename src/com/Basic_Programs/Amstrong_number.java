package com.Basic_Programs;

import java.util.Scanner;

public class Amstrong_number {
    public static void main(String[] args) {
        System.out.println("Enter range to find all the amstrong number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = 1 ; i <=num ; i++)
        {
            int n = i;
            int sum = 0;
            while(n>0)
            {
                sum+=(int)(Math.pow(n%10,3));
                n/=10;
            }
            if(sum == i)
                System.out.println(i);
        }
    }
}
