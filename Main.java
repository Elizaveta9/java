package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input n >> ");
        int n = scan.nextInt();
        System.out.print("Input a >> ");
        float a = scan.nextFloat();
        float p = a * (a + 1);
        for (int i = 2; i < n; i++) {
            p *= (a + i);
        }
        System.out.println(p);
    }
}
