package com.company;
import java.util.Scanner;

public class cwh_35_ch_7_practice_set4 {


    public   static void multitable(int num)
    {
        for (int i=num;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter num  ");
        int num = sc.nextInt();
        multitable(num);

    }
}


