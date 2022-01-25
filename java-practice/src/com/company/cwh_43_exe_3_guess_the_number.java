package com.company;
import java.util.Random;
import java.util.Scanner;

class game {
public int rand,number,guess=0;
    public game(){
        Random dice = new Random();
         rand= dice.nextInt(100);

}
public void takeuserinput(int a){
         number=a;
}
public boolean iscorrnumber(){

       if (number<rand){
           System.out.println("choose higher number ");
           guess++;

           return false;
       } else if (number>rand){
           System.out.println("choose lower number ");
           guess++;
           return false;
       }else{
           System.out.println("yepp! you choose correct number in "+guess+"atempt");
           return true;
       }
}

    public static class cwh_43_exe_3_guess_the_number {
        public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
game one=new game();
            System.out.println("please enter your number ");
while (!one.iscorrnumber()){

    one.takeuserinput(sc.nextInt());

}

        }
    }
}
