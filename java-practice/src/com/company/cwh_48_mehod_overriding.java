package com.company;

class A1{
    public int a;
    public int harry1(){
        return 4;

    }
    public void meth2(){
        System.out.println("i am method 2 of class A");
    }

}

class B1 extends A1 {
    @Override
    public void meth2(){
        System.out.println("i am method 2 of class B");
    }

    public void method3(){
        System.out.println("i am mehod 3 of class A");
    }
}


public class cwh_48_mehod_overriding {
    public static void main(String[] args) {

        A1 one=new A1();
        one.meth2();


        B1 oye=new B1();
        oye.meth2();



    }
}
