package com.company;
import java.util.Scanner;

public class cwh_29_ch_6_practice_set2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("enter number that you find in array hawkey ");
        int num= sc.nextInt();
        int []hawkey={11,12,13,14,15};
int a=1;
        for (int i=0;i<hawkey.length;i++)
        {
            if (hawkey[i]==num)
            {
                System.out.println("your number is present in array ");
                a=2;
                }

        }
        if (a==1){
            System.out.println("your number is not present in array");
        }
    }
}
