package com.company;
class cylinder{
    int radius;
    int height;

    public void setradius(int n)
    {
         radius=n;
    }
    public int getradius(){
        return radius;
    }
    public void setHeight(int n)
    {
        height=n;
    }
    public int getHeight(){
        return height;
    }

}
public class cwh_42_ch_9_constructors_practice_set1 {
    public static void main(String[] args) {

        cylinder one = new cylinder();

        one.setradius(5);
        System.out.println(one.getradius());
        one.setHeight(6);
        System.out.println(one.getHeight());


    }
}
