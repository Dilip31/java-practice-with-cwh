package com.company;
import javax.print.Doc;


class ek{
    int a;

    ek(int a){
        this.a=a;
    }

    public int getA() {
        return a;
    }
    public int returnone(){
        return 1;
    }
}

class two extends ek{

    //in this case supper is used to invoke setter method of  child class

    two(int b){
        super(b);
    }
}



public class cwh_47_ch_10_this_and_super {
    public static void main(String[] args) {
        two one =new two(5);
        ek on=new ek(4);


        System.out.println(on.getA());
    }
}
