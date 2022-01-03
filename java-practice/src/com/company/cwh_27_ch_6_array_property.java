package com.company;

public class cwh_27_ch_6_array_property {
    public static void main(String[] args) {
        int []marks={50,60,80,90,68};
//        printing array with naive method
        System.out.println("printing arry using naive method ");
        System.out.println(marks[0]);

        System.out.println(marks.length);

//        printing array with for loop  method
        System.out.println("printing array using for loop");
        for (int i=0;i<5;i++)
        {
            System.out.println(marks[i]);
        }

//string array
        System.out.println("string arry ");
        String []students={"harry","rohan","subham","lovish"};
        System.out.println(students.length);
        System.out.println(students[1]);


//        printing array using for each loop
        System.out.println("printing array using for each method ");
        for (int element:marks )
//        int like go and come with element in marks array
        {
            System.out.println(element);
        }
    }
}
