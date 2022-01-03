package com.company;

public class cwh_29_ch_6_practice_set1 {
    public static void main(String[] args) {
        float []array={12.30f,13.20f,25.20f,11.50f,13.50f};
float sum=0;
        for (int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" + ");

            sum=sum+array[i];
        }
        System.out.println("="+sum);
    }
}
