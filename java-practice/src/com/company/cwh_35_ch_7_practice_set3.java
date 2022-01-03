package com.company;
import java.util.Scanner;

public class cwh_35_ch_7_practice_set3 {


    public   static int  multitable(int num)
    {int sum =0;
      if (num!=0) {
          sum +=num + multitable(num - 1);
      }
      return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter num  ");
        int num = sc.nextInt();
        int p=multitable(num);
        System.out.println(p);

    }
}

