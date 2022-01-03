package com.company;
import java.util.Scanner;

public class cwh_35_ch_7_practice_set8{

static void row(int i,int n)

{ if (i<=n) {
    col(1, i);
    System.out.println();
    row(i + 1, n );
}
}
static void col(int j,int  i)
{
    if (j<=i) {
        System.out.print("*");
        col(j + 1, i);
    }
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter num  ");
        int n = sc.nextInt();
        row(1,n);

    }
}

