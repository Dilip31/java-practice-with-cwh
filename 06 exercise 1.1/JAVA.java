package com.company.Ecercise_1_1;
import java.util.Scanner;


public class JAVA {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("plese enter your mark in subject 1 ");
        int a=sc.nextInt();

         System.out.println("plese enter your mark in subject 2 ");
        int b=sc.nextInt();

         System.out.println("plese enter your mark in subject 3 ");
        int c=sc.nextInt();

         System.out.println("plese enter your mark in subject 4 ");
        int d=sc.nextInt();

         System.out.println("plese enter your mark in subject 5 ");
        int e=sc.nextInt();

        float sum=a+b+c+d+e;

        float percentages=sum/5;
        System.out.print("your percentages is :%");
        System.out.println(percentages);





    }
}
