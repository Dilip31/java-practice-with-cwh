package com.company;

public class cwh_31_ch_7_methods {
    static int logic(int a,int b)
    {int c;
     if (a>b)
     {
         c=a+b;

     }
     else {
         c=a-b;

     }
     return c;
    }
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int c;
c=logic(5,2);


        System.out.println(c);

    }
}
