package com.company;
class sphere{
    float radius;
    float height;
    float surfacearea;
    float volume;

    public sphere(float n,float j){
        radius=n;
        height=j;
        volume=(float)((4*3.14*radius*radius*radius)/3);
        surfacearea=(float)(4*3.14*radius*radius);
        System.out.println(radius);
        System.out.println(height);
        System.out.println(surfacearea);
        System.out.println(volume);

    }
}
public class cwh_42_ch_9_constructors_practice_set5 {
    public static void main(String[] args) {
        sphere one = new sphere(5,6);

    }
}
