package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число >> ");
        int first = scan.nextInt();
        System.out.print("Введите последнее число >> ");
        int last = scan.nextInt() + 1;
        int[] arr = new int[last - first];
        for (int j = 0, i = first; j < arr.length; j++, i++) {
            arr[j] = i;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (isSimple(arr[i]) & isSimple(arr[i + 2]))
                System.out.printf("%d %d\n", arr[i], arr[i + 2]);
        }
    }

    static boolean isSimple(int num) {
        if (num == 2)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

