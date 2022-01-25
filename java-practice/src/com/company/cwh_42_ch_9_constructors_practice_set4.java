package com.company;
class rectangle1{
    float length;
    float breadth;

    public rectangle1(float i,float j){
        length=i;
        breadth=j;
        System.out.println(length);
        System.out.println(breadth);

    } public rectangle1(){
        length=35;
        breadth=36;
        System.out.println(length);
        System.out.println(breadth);
    }

}

public class cwh_42_ch_9_constructors_practice_set4 {
    public static void main(String[] args) {

        rectangle1 one = new rectangle1(4,5);
        rectangle1 two = new rectangle1();

    }
}
