package com.company;
import java.util.Scanner;

class library{
    public int i=5,b=0;
    public String[] arr = new String[30];
    public String[] borrow = new String[10];

    public library(){
        arr[0]="shawshank";
        arr[1]="sangchi";
        arr[2]="ironman";
        arr[3]="babysitter";
        arr[4]="daredevil";
    }

    public void showbook(){
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }public void showname(){
        for (int i=0;i<borrow.length;i++)
        {
            System.out.println(borrow[i]);
        }
    }

public void addbook(String k){
        arr[i]=k;
        i++;
}public void addname(String k){
        borrow[b]=k;
        b++;
}

    public void returnbook(String k) {

        String p=k;
        for (int i = 0; i < borrow.length; i++) {
if (p==borrow[i]) {
    borrow[i]=null;
}
}
        }
    }


public class cwh_51_exe_4_make_library {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
      library one = new library();

      one.showbook();

        System.out.println("if you have enter a book in library then enter 5 otherwise enter 6");
        int j= sc.nextInt();

        if (j==5){
            System.out.println("please enter book name for add book ");


            one.addbook(sc.next());

            one.showbook();
        }



        System.out.println("if you have borrow a book enter 5 ");
        System.out.println("if you have return a book enter 6 ");
        int n=sc.nextInt();

        if (n==5)
        {
            System.out.println("please enter your first name only ");
            one.addname(sc.next());
            one.showname();
        }
        else {
            System.out.println("please enter your first name only ");
            one.returnbook(sc.next());

            one.showname();
        }
    }
}
