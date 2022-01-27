package com.company;

class supper{
    public void meth1(){
        System.out.println("hey i am meth1 of supper");
    }

    public void meth2(){
        System.out.println("hey i am meth2 of supper");
    }
}

class sub extends supper{

    public void meth2(){
        System.out.println("hey i am meth2 of sub class");
    }
    public void meth3(){
        System.out.println("hey i am meth3 of sub class");
    }

}

public class cwh_49_dynemic_method_dispach {
    public static void main(String[] args) {

        supper one = new sub();
        // ahi new lakhel che atle run time ma run thay
        one.meth1();
        one.meth2();
       // one.meth3();  --->this is not allowed

       //  sub two = new supper();   --->this is not allowed
    }
}
