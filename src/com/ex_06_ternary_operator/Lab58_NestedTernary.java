package com.ex_06_ternary_operator;

public class Lab58_NestedTernary {
    public static void main(String[] args) {
        int age=25;
        int age1=21;
        String res= age>18 ?(age>=21 ? "You can go to GOA and have drink": "You can go bt no drinks"): "You can't go to GOA";
        System.out.println(res);
    }
}
