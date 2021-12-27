package com.company;

public class ch_3_que3 {
    public static void main(String[] args) {
        String letter = "dear <|name|> , thanks a lot!";

        letter=letter.replace("<|name|>","dilip");

        System.out.println(letter);
    }
}
