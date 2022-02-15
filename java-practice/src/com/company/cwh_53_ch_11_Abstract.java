package com.company;

abstract class parent2{
    public void sayhello(){
        System.out.println("hello");
    }

    abstract public void greed();


}

class child2 extends parent2{

    public void greed(){
        System.out.println("good morning");
    }

}


class child3 extends parent2 {

    public void greed() {
        System.out.println("good afternoon");
    }
}
 abstract class child4 extends parent2 {
     public void greed() {
         System.out.println("good ");
     }
     abstract public void shape();
 }
class child5 extends child4 {

    public void shape() {
        System.out.println("heyy my shape is circle ");
    }
}


public class cwh_53_ch_11_Abstract {
    public static void main(String[] args) {

//        parent2 p = new parent2();   this is wrong

        child2 c2 = new child2();
        c2.greed();

//child4 c4 = new child4();           this is wrong

        child5 c5 = new child5();
        c5.greed();
        c5.shape();


    }
}
