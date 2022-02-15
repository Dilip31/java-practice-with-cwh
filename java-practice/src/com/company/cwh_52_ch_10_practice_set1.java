package com.company;



class circle3{

     public int radius;

     circle3(int r){

         System.out.println("i am constructor of circle ");
         this.radius=r;
     }
    public double radius(){
        return  Math.PI*this.radius*this.radius;
    }
}
class cylinder3 extends circle3{
    public int height;
cylinder3(int h,int r){

    super(r);
    System.out.println("i am constructor of cylinder3");
    this.height=h;

}
    public double volume(){
        return  Math.PI*this.radius*this.radius*this.height;
    }
}
public class cwh_52_ch_10_practice_set1 {
    public static void main(String[] args) {
circle3 one  = new circle3(6);
cylinder3 two = new cylinder3(8,3);
    }
}
