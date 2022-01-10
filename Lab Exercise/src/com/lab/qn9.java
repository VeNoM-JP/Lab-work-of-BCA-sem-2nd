package com.lab;

import java.util.Scanner;

public class qn9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=0;
        System.out.print("Enter number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while(true){
            r=num1%num2;
            if (r==0) {
                System.out.println("HCF = " + num2);
                break;
            }
            num1=num2;
            num2=r;

        }
    }
}
