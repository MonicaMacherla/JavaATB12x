package com.ex_03_literals;

public class lab34_Char_Literal {
    public static void main(String[] args) {
        char c1='A';
       // char c2="A";// If "" then it is String
        char c2='@';
        char c3='B';
        char c5='(';
        char c6=' ';

        //Escape CHar

        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("MonicaM");
        System.out.println("Monica"+new_line+"M");
        System.out.println("Monica\nM");
        System.out.println("Monica"+tab_line+"M");
        System.out.println("Monica\tM");
        System.out.println("Monica"+back_space+"M");

        System.out.println("Monica is"+carriage_return+"M"); //\r will delete  word before


    }
}
