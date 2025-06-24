package com.ex_14_strings;

public class Lab82_Immutable {
    public static void main(String[] args) {
        String s1="Hello";
      s1=  s1.concat("World");
        System.out.println(s1);//HelloWorld  as we are assigning it to s1 again in Line 7

    }
}
