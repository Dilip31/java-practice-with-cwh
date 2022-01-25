package com.company;

class A{
    public int a;

    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
     @Override
     public void meth2(){
        System.out.println("I am method 2 of class B");
    }

    public void meth3(){
        System.out.println("I am method 3 of class B");
    }


}
public class cwh_28_ch_10_method_overloading {
    public static void main(String[] args) {

        A a=new A();
        a.meth2();

        B b=new B();
        b.meth2();

    }
}
