package com.company;
import java.util.Scanner;

public class cwh_07_ch_1_practice_set_4{
    public static void main(String[] args) {
        System.out.println("please enter distance into kilometer ");
        Scanner sc=new Scanner(System.in);

        int kilometer= sc.nextInt();
        double miles=kilometer * 0.621371;

        System.out.println(miles);

    }
}
