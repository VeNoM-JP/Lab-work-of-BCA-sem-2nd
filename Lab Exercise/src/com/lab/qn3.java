package com.lab;

import java.util.Scanner;

public class qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul;
        System.out.print("Enter positive number : ");
        int num = sc.nextInt();
        for (int i = 1; i <11 ; i++) {
            mul=num*i;
            System.out.println(num+" X "+i+" = "+mul);
        }
    }
}
