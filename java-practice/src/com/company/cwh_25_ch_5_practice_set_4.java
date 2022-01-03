package com.company;
import java.util.Scanner;

public class cwh_25_ch_5_practice_set_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        System.out.println("enter num for multiplication table ");
        int num= sc.nextInt();
        for (int i=10;i>0;i--)
        {
            System.out.println(num +" x "+i+"="+num*i);
        }
    }
}
