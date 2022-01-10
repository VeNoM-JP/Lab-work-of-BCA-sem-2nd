package com.lab;

import java.util.Scanner;

public class qn8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            }
        }
        if (i == num) {
            System.out.println(num + " is a prime number.");
        }
        else
        System.out.println(num + " is not a prime number.");
    }
}
