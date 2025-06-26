package com.ex_14_strings;

public class Lab87_SubSequence {
    public static void main(String[] args) {
        CharSequence s1= "Java".subSequence(1,2); //a, here the we have give from
        // 1 to 2 and last sequence i.e., 2 nd will be ignored
        System.out.println(s1);

        CharSequence s2= "Monica".subSequence(2,5); //nic
        System.out.println(s2);

    }
}
