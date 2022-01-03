package com.company;

import java.util.Scanner;


public class cwh_05_taking_user_input {
    public static void main(String[] args) {
        System.out.println("it works !");  // by sout+enter

        System.out.println("taking input from the user");
        Scanner SC=new Scanner(System.in);

//        **************for sum of two numbers*************

//        System.out.println("enter number 1 ");
//        int a= SC.nextInt();
//
//        System.out.println("enter number 2 ");
//        int b= SC.nextInt();
//
//        int sum=a+b;
//        System.out.println("the sum of these number is ");
//        System.out.println(sum);

//           **************for check intput is number or not***********
//        boolean b1= SC.hasNextInt();
//
//        System.out.println(b1);

//**************for input string******************

        String str= SC.nextLine();
        System.out.println(str);


    }
}




