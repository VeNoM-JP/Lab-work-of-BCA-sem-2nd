package com.lab;

import java.util.Scanner;

public class qn5 {
    public static int  power(int num ,int a) {
        int p;
        if (a==0){
            return 0;
        }
        else if(a==1)
            return num;
        else
            p=num* power(num,a-1);
            return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,num,p;
        System.out.print("Enter number and it's power : ");
        num= sc.nextInt();
        a= sc.nextInt();
        p=power(num,a);
        System.out.println(num+" to power "+a+" = "+p);
    }
}
