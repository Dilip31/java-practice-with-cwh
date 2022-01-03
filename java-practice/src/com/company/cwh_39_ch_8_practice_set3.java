package com.company;
class square{
    int a;

    public int side(){
return a;
    } public int area(){
return a*a;
    } public int perameter(){
return 4*a;
    }
}
public class cwh_39_ch_8_practice_set3 {
    public static void main(String[] args) {
square first = new square();

first.a=10;
        System.out.println(first.area());
        System.out.println(first.side());
        System.out.println(first.perameter());
    }
}
