package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a >> ");
        float a = scan.nextFloat();
        double z = Math.pow(Math.cos(Math.toRadians(3 / 8.0 * PI - a / 4)), 2) - Math.pow(Math.cos(Math.toRadians(11 / 8.0 * PI - a / 4)), 2);
        System.out.printf("z = %.4f", z);
    }
}
