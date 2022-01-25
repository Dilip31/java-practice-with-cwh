package com.company;
class cylinder1{
    float radius;
    float height;

    public void setradius(float n)
    {
        radius=n;
    }
    public float getradius(){
        return radius;
    }
    public void setHeight(float n)
    {
        height=n;
    }
    public float getHeight(){
        return height;
    }
    public float surfacearea(){
        return (float)(2*3.14*radius*height+2*3.14*radius*radius);
    }
    public float volume(){
        return (float)(radius*radius*3.14*height);

    }

}
public class cwh_42_ch_9_constructors_practice_set2{
    public static void main(String[] args) {

        cylinder1 one = new cylinder1();

        one.setradius(5);
        System.out.println(one.getradius());
        one.setHeight(6);
        System.out.println(one.getHeight());
        System.out.println(one.surfacearea());
        System.out.println(one.volume());


    }
}
