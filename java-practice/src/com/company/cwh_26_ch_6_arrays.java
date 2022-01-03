package com.company;

public class cwh_26_ch_6_arrays {
    public static void main(String[] args) {
//1 way to declare aray
        int [] marks=new int[5];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        marks[3]=40;
        marks[4]=50;
        System.out.println(marks[4]);
//2 way to declare array
        int []way;
        way=new int [5];
        way[3]=33;
        System.out.println(way[3]);
//3 way to declare array

        int []far={1,2,3,4,5};
        System.out.println(far[0]);


    }
}
