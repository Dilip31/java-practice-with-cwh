package com.company;

class rectangle3{
    public int length;
    public int width;
    rectangle3(int l,int w){
        System.out.println("i am  a constructor of rectangle3");
        this.length=l;
        this.width=w;
    }
    public double area(){
        return width*length;
    }


}

class cubic3 extends rectangle3{
    public int side;//side =6
    public int a;//a=length of each side

    cubic3(int a,int s){

        super(a,s);
        System.out.println("i am a constructor of cubic3");
    }

    public double area(){
        return length*length*width;
    }
}

public class cwh_52_ch_10_practice_ser2 {
    public static void main(String[] args) {
rectangle3 one =new rectangle3(5,6);
cubic3 two = new cubic3(4,6);

        System.out.println(one.area());
        System.out.println(two.area());
    }
}
