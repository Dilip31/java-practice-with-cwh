package com.company;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class que_3 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        int give=50;
        System.out.println("please enter your number ");
        int a= SC.nextInt();

        System.out.println(a>give);

    }
}
