package com.company;
import java.util.Scanner;

public class cwh_35_ch_7_practice_set1 {


  public   static void multitable(int num)
  {
      for (int i=1;i<=10;i++)
      {
          System.out.println(num+" x "+i+" = "+i*num );
      }
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter num that you have multiplication table ");
        int num = sc.nextInt();
multitable(num);

    }
}
