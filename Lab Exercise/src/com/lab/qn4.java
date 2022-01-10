package com.lab;

import java.util.Scanner;

public class qn4 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print factorial: ");
        num=sc.nextInt();
        long factorial=1;
        for (int i=num; i >0 ; i--) {
            factorial*=i;
        }
        System.out.println("Factorial of "+num+" = "+factorial);
    }
}
