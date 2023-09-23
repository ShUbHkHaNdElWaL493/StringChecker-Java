package com.codes.java.stringchecker;

import java.util.Scanner;

public class StringChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dummy1 = 0;
        Functions Func = new Functions();
        do {
            int dummy2 = 0;
            System.out.println("");
            char[] Str = Func.InputString();
            System.out.println("");
            Func.CheckString(Str);
            while (dummy2 == 0) {
                System.out.println("");
                System.out.println("Do you want to check another string? (Yes / No)");
                String choice = sc.nextLine();
                if ("Yes".equalsIgnoreCase(choice)) {
                    dummy2++;
                } else if ("No".equalsIgnoreCase(choice)) {
                    dummy1++;
                    dummy2++;
                } else {
                    System.out.println("");
                    System.out.println("Please enter Yes / No only.");
                }
            }
        } while (dummy1 == 0);
    }
}
