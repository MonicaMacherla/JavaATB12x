package com.ex_04_Operators;

public class Lab47_Compound_Operator {
    public static void main(String[] args){
        int a=10;
        a +=10; // a=a+10-- Coumpound Operator
        int b=20;
        b/=a;

        int c=8;
        c-=3;

        int d=6;
        d *=5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
