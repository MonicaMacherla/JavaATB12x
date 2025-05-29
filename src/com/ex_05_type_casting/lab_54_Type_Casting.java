package com.ex_05_type_casting;

public class lab_54_Type_Casting {

   public static void main(String[] args){
       byte b=10;
       int a=b; //Implicit Widening
       int a1= (int)b; //Explicit Widening

       System.out.println(a);
       System.out.println(a1);
   }
}
