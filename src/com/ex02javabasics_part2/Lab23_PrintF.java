package com.ex02javabasics_part2;

public class Lab23_PrintF {
    public static void main(String[] args){
        int a=10;
        System.out.printf("Value of a is %d",a);
        System.out.println();

        //%d for int, short, long, byte
        //%f for float, double
        //%b for boolean
        //%s for String
        int b=20;
        System.out.printf("a=%d , b=%d",a,b);
        System.out.println();
        System.out.println("a= "+a + ", b="+b);
       // System.out.println();
       // System.out.printf("%d",a," " +" " ,"%d",b);
    }
}
