package com.ex_15_String_Builder_Buffer;

import java.util.Locale;

public class Lab89_String_Functions {
    public static void main(String[] args) {
        String s1="Monica";
        System.out.println(s1.length()); //6
        System.out.println(s1.charAt(2)); //n
       // System.out.println(s1.charAt(10)); //java.lang.StringIndexOutOfBoundsException

        System.out.println(s1.concat("Macherla"));//MonicaMacherla
        System.out.println(s1.contains("on")); //true
        System.out.println(s1.equals("monica"));//false
        System.out.println(s1.equalsIgnoreCase("monica"));//true
        System.out.println(s1.indexOf("o"));//1

        String s2="madam";
        System.out.println(s2.indexOf("m"));//0
        System.out.println(s2.lastIndexOf("m"));

        System.out.println(s2.replace("m","M"));//MadaM
        System.out.println(s2.substring(1,3));//ad
        System.out.println(s2.toUpperCase()); //MADAM
        System.out.println(s2.toLowerCase());//madam
        System.out.println(s2.toUpperCase(Locale.ROOT));

        System.out.println(s1.startsWith("N"));//False
        System.out.println(s1.concat("Macherla"));

        String name3 = "   Monica Rakesh    ";
        System.out.println(name3.trim());//MonicaRakesh

        // 17. compareTo()
        System.out.println(s1.compareTo("Monica"));//0

        StringBuilder stringBuilder=new StringBuilder("Monica");
        System.out.println(stringBuilder);//Monica

        StringBuffer stringBuffer=new StringBuffer("Rakesh");
        System.out.println(stringBuffer);//Rakesh

    }
}
