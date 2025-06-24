package com.ex_14_strings;

public class Lab85_StringFunctions {
    public static void main(String[] args) {
        String s1="Hello"; //SCP
        String s2="Hello";
        String s3=new String("Hello");
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println(s2==s3);//false
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.concat(s3)); //HelloHello stored in SCP
        System.out.println(s1.indexOf('l'));

    }
}
