package com.company;
class rectangle{
    int l;
    int w;

    public int perameter1(){
        return ((2*l)+(2*w));

    } public int area(){
        return l*w;

    } public int length(){
        return l;

    } public int width(){
        return w;

    }
}
public class cwh_39_ch_8_practice_set4 {
    public static void main(String[] args) {
rectangle first  =new rectangle();
first.l=10;
first.w=7;

        System.out.println(first.area());
        System.out.println(first.perameter1());
        System.out.println(first.length());
        System.out.println(first.width());
    }
}
