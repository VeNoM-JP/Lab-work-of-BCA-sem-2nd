package com.lab;

import java.util.Scanner;

public class qn10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1;
        do {
            System.out.print("Enter two number : ");
            int num1= sc.nextInt();
            int num2= sc.nextInt();
            System.out.println("Sum of "+num1+" and "+num2+ " =  "+(num1+num2));
            System.out.println("_________________________");
            System.out.print("If you want to continue then press 1 or not then 0 : ");
            n= sc.nextInt();
        }while(n==1);
    }
}
