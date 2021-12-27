package com.company;

import java.util.Locale;

public class string_methods_14 {
    public static void main(String[] args) {
        String name ="DILIP";
        System.out.println(name);
        int value=name.length();
        System.out.println(value);
String name1=name.toLowerCase();
        System.out.println();
        System.out.println(name1);
        String name2=name1.toUpperCase();
        System.out.println(name2);
        System.out.println();
        String nontrimstring="   hi   ";
      String trimedstring=nontrimstring.trim();
        System.out.println(nontrimstring);
        System.out.println(trimedstring);
        //or

//        String nontrimstring="   hi   ";
//
//        System.out.println(nontrimstring);
//        System.out.println(trimedstring);

        System.out.println(name.substring(3));
        System.out.println(name.substring(1));
        System.out.println();
        System.out.println(name.substring(1,5));//starting is included and ending excluded
        System.out.println();
        System.out.println(name.replace('I','o'));
        System.out.println(name.replace("I","ier"));
        System.out.println();

        System.out.println(name.startsWith("DIL"));
        System.out.println(name.startsWith("Dop"));
        System.out.println();
        System.out.println(name.endsWith("IP"));
        System.out.println(name.endsWith("ip"));
        System.out.println();
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(4));
        System.out.println();
        System.out.println(name.indexOf("I"));
        System.out.println(name.indexOf("DI"));

        String newname="mynameisgeurgio";
        System.out.println(newname.indexOf("g",3));
        System.out.println(newname.indexOf("ge",6));
        System.out.println();

        System.out.println(newname.indexOf("i",2));
        System.out.println(newname.lastIndexOf("i"));
        System.out.println(newname.lastIndexOf("i",8));
        System.out.println(newname.lastIndexOf("na",7));
        System.out.println();

        System.out.println(name.equals("DILIP"));
        System.out.println(name.equalsIgnoreCase("DIliP"));
        System.out.println(name.equalsIgnoreCase("dilIp"));
        System.out.println(name.equalsIgnoreCase("harry"));

        System.out.println("my name is geuani georgio \" peapal calls me gorg");
    }
}
