package com.company;
import java.util.Scanner;

public class cwh_25_ch_5_practice_set_6 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("enter number for factorial ");
        int num= sc.nextInt();
        int factorial=1;
        int i=1;
        while (i<=num)
        {
            factorial=factorial*i;
            i++;
        }
        System.out.println(factorial);
    }
}
