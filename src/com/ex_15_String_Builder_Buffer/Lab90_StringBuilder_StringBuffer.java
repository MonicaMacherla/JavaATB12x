package com.ex_15_String_Builder_Buffer;

public class Lab90_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        String s1="Monica";
        String s2=new String("Monica");

        StringBuilder sb=new StringBuilder("Monica");
        StringBuffer sb1=new StringBuffer("Rakesh");

        System.out.println(sb);//Monica
        System.out.println(sb1);//Rakesh
        System.out.println(sb.reverse());//acinoM
        System.out.println(sb1.reverse());//hsekaR
    }
}
