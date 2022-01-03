package com.company;

public class cwh_15_ch_3_practice_set_3{
    public static void main(String[] args) {
        String letter = "dear <|name|> , thanks a lot!";

        letter=letter.replace("<|name|>","dilip");

        System.out.println(letter);
    }
}
