package com.company;

class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;

    }

    public String gername(){
        return name;

    }
    public void  setname(String n){

        name=n;


    }
}

public class cwh_39_ch_8_practice_set1 {
    public static void main(String[] args) {

        Employee1 migel =new Employee1();

        migel.setname("champmigel");
        System.out.println(migel.gername());

        migel.salary=50;
        System.out.println(migel.getSalary());
    }

}
