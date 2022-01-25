package com.company;
class base{
    int a;

    public void setA(int a) {
        System.out.println("i am base and setting a now");
        this.a = a;
    }
    public void printme(){
        System.out.println("i am a constructor");
    }

    public int getA() {
        return a;
    }
}

class derived extends base{
    int b;

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }
}
public class cwh_45_ch_10_inheritence {
    public static void main(String[] args) {

        derived one= new derived();
        one.setB(5);
        System.out.println(one.getB());
    }
}