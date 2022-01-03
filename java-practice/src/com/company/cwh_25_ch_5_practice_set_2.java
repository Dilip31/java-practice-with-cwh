package com.company;
import java.util.Scanner;

public class cwh_25_ch_5_practice_set_2 {
    public static void main(String[] args) {
                 Scanner sc= new Scanner(System.in);


        System.out.println("enter nth number to sum of even numbers ");
        int n= sc.nextInt();
        int sum=0;

        for (int i=1;i<=n*2;i++)
        {
            if (i%2==0)
            {
                sum=sum+i;

            }
        }
        System.out.println(sum);
    }
}
