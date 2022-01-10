package com.lab;

import java.util.Arrays;
import java.util.Scanner;

public class qn7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,evensum=0,oddsum=0;
        System.out.print("Enter how many number you want to enter : ");
        n= sc.nextInt();
        int[] num= new int[n];
        System.out.print("Enter "+n+" number :");
        for (int i = 0; i < n; i++) {
            num[i]= sc.nextInt();
        }
        System.out.println("You entered : "+ Arrays.toString(num));
        for (int i = 0; i <n ; i++) {
            if (num[i]%2==0)
                evensum+=num[i];
            else
                oddsum+=num[i];

        }
        System.out.println("Sum of Even number is : "+evensum);
        System.out.println("Sum of Odd number is : "+oddsum);
    }
}
