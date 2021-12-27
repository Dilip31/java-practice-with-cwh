package com.company;
import java.util.Random;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        // write your code here

        Random dice = new Random();+
Scanner sc  = new  Scanner(System.in);
        int numver;

        for (int i = 0; i < 5; i++)
        {
            numver= dice.nextInt(3);
            System.out.println("enter 1 for rock ,2 for paper ,3 for sizer ");
            int a= sc.nextInt();
            if (numver==a)
            {
                System.out.println("arre mach is draw !");
            } if (numver==1 && a==2)
            {
                System.out.println("you win !");
            }if (numver==1 && a==3)
            {
                System.out.println("you losss !");
            }if (numver==2 && a==1)
            {
                System.out.println("you losss !");
            }if (numver==2 && a==3)
            {
                System.out.println("you won !");
            }if (numver==3 && a==1)
            {
                System.out.println("you won !");
            }if (numver==3 && a==2)
            {
                System.out.println("you loss !");
            }
            if (a>3 || a<=0){
                System.out.println("please enter number between 1 to 3  ");
        }
        }


    }
}
