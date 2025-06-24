package com.ex_14_strings;

public class Lab86_StringExamples {
    public static void main(String[] args) {
        String s1="Java";
        char c=s1.charAt(2);
        System.out.println(c);//v

        System.out.println(s1.codePointAt(0)); //74

       int res= "abc".compareTo("ABC");
        System.out.println(res); //32
       int res1= "abc".compareToIgnoreCase("ABC"); //0
        System.out.println(res1);

        int a= "java".indexOf('a');
        System.out.println(a); //1

        int a1= "java".lastIndexOf('a');
        System.out.println(a1); //3

        boolean b="".isEmpty();
        System.out.println(b);//true

        String s3= String.join("-","Java", "Python");
        System.out.println(s3);//Java-Python

        String s4= "Java".replace("a","o"); //Jovo
        System.out.println(s4);

        boolean b1= "Java".startsWith("Ja");
        System.out.println(b1); //true
    }
}
