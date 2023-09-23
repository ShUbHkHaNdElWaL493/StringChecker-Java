package com.codes.java.stringchecker;

import java.util.ArrayList;
import java.util.Scanner;

class Functions extends StringChecker {

    public char[] InputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string.");
        String x = sc.nextLine();
        return x.toCharArray();
    }

    public void CheckString(char[] Array) {
        int length = Array.length;
        int[] Counter = new int[length];
        for (int x = 0; x < length; x++) {
            Counter[x] = 0;
        }
        ArrayList<Integer> MaxList = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (Array[i] == Array[j]) {
                    Counter[i] = Counter[i] + 1;
                }
            }
            if (Counter[i] > max) {
                max = Counter[i];
            }
        }
        for (int m = 0; m < length; m++) {
            for (int n = 0; n < length; n++) {
                if (m != n && Array[m] == Array[n]) {
                    break;
                }
                if (Counter[m] == max && m == n) {
                    MaxList.add(m);
                }
            }
        }
        if (max == 1) {
            System.out.println("No character has been repeated in the string.");
        } else {
            System.out.println("The following characters have been repeated the most times.");
            for (int c : MaxList) {
                System.out.println("The character '" + Array[c] + "' has been repeated " + Counter[c] + " times.");
            }
        }
    }

}
