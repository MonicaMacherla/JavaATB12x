package com.ex_15_String_Builder_Buffer;

public class Lab93_SB {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Monica");
        System.out.println(sb.append(" Macherla"));//Monica Macherla
        sb.reverse();
        System.out.println(sb);//alrehcaM acinoM

        StringBuffer sb1=new StringBuffer("Java");
        sb1.append(" Programming");
        sb1.replace(0,4,"C++");//C++ Programming
        System.out.println(sb1);
    }
}
