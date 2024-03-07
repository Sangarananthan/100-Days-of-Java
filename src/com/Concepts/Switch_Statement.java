package com.Concepts;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        System.out.println("Enter some fruits name ");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "orange":
                System.out.println("Sour and sweet orange food");
                break;
            case "apple": {
                System.out.println("Healthy red fruit");
                break;
            }
            case "mango":
                System.out.println("It's my favorite fruit!!");

        }
        switch (fruit) {
            case "orange" -> System.out.println("Sour and sweet orange food");
            case "apple" -> System.out.println("Healthy red fruit");
            case "mango" -> System.out.println("It's my favorite fruit!!");
        }
    }
}
