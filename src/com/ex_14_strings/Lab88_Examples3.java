package com.ex_14_strings;

public class Lab88_Examples3 {
    public static void main(String[] args) {
        String s1="Java".substring(2);//va
        System.out.println(s1);

        char[] s2="Java".toCharArray();
        System.out.println(s2);

        String s3= " Java ".trim(); //removes Spaces
        System.out.println(s3);

        boolean b=" ".isBlank();
        System.out.println(b);//true

        boolean b1=" Jav".isBlank();
        System.out.println(b1); //false

        String s4= "AB".repeat(2);
        System.out.println(s4); //ABAB

        String s111 = String.format("%s = %d", "age", 25);
        System.out.println(s111);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);
    }
}
