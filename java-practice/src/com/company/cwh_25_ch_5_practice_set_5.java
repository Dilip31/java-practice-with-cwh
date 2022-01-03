package com.company;
import java.util.Scanner;

public class cwh_25_ch_5_practice_set_5 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

        System.out.println("enter number for factorial ");

int num= sc.nextInt();
int sum=1;
for (int i=num;i>=1;i--)
{
    sum=sum*i;
}

        System.out.println(sum);
    }
}
