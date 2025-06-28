package com.ex_15_String_Builder_Buffer;

public class Lab91_SB {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Monica");
        System.out.println(sb.append(" Macherla")); //Monica Macherla
        System.out.println(sb);

        String s1="Monica";
        s1=s1+"Macherla";
        System.out.println(s1);

        StringBuilder sb1=new StringBuilder("Monica");
        System.out.println(sb1.append("Macherla"));//MonicaMacherla
        System.out.println(sb1);//MonicaMacherla
    }
}
