package com.company;
class circle {
    int r;
    float pie=3.14f;

    public float  perameter2(){
        return 2*pie*r;

    } public float  area(){
        return pie*r*r;

    } public float  radius(){
        return r;

    }
}
public class cwh_39_ch_8_practice_set6 {
    public static void main(String[] args) {
        circle first  =new circle();
        first.r=10;


        System.out.println(first.area());
        System.out.println(first.perameter2());
        System.out.println(first.radius());
       
    }
}
