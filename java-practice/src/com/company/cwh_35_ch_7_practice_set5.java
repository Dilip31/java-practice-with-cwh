package com.company;
import java.util.Scanner;

public class cwh_35_ch_7_practice_set5 {



    public   static int  multitable(int num )
    {
     if (num==0)
     {
         return 0;
     }
else if(num==1)
     {
         return 1;

     }else
     {
         return multitable(num-2)+multitable(num-1);

     }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter term that you want from fibonachhi series   ");
        int num = sc.nextInt();
        int p=multitable(num);
        System.out.println(p);
    }
}


