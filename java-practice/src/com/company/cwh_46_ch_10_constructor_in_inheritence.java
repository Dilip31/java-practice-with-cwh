package com.company;

class base1{
    base1(){
        System.out.println("i am in base1 and simple mod ");
    }

    base1(int x){
        System.out.println("i am in base1 and overloading mode x is  "+x);
    }
}
class derived1 extends base1{
    derived1(){
        System.out.println("i am in derived1 and simple mod ");
    }

    derived1(int x,int y){
        super(x);
        System.out.println("i am in derived1 and overloading mode and y is  "+y);
    }
}
class derived2 extends derived1{
    derived2(){
        System.out.println("i am in derived2 and simple mod ");
    }

    derived2(int x,int y,int z){
        super(x,y);
        System.out.println("i am in derived2 and overloading mode and z is  "+z);
    }
}

public class cwh_46_ch_10_constructor_in_inheritence {
    public static void main(String[] args) {

        derived2 one =new derived2(4,5,6);

    }
}