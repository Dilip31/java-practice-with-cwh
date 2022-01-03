package com.company;
import java.util.Scanner;

public class cwh_35_ch_7_practice_set9 {
    static void convert(float  a)
    {
        float fahrenheit= (float) ((a*1.8)+32);
        System.out.println(fahrenheit);
    }
    public static void main(String[] args) {
        System.out.println("please enter tempreture into celsius ");
Scanner sc = new Scanner(System.in);

float celcius= sc.nextFloat();
convert(celcius);

    }
}
