package com.company;
class cylinder2{
    float radius;
    float height;
    float surfacearea;
    float volume;

    public cylinder2(float n,float j){
        radius=n;
        height=j;
        surfacearea=(float)(2*3.14*radius*height+2*3.14*radius*radius);
        volume=(float)(radius*radius*3.14*height);
        System.out.println(radius);
        System.out.println(height);
        System.out.println(surfacearea);
        System.out.println(volume);

    }
}
public class cwh_42_ch_9_constructors_practice_set3 {
    public static void main(String[] args) {
        cylinder2 one = new cylinder2(5,6);

    }
}
