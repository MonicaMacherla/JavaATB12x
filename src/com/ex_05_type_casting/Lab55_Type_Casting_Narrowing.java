package com.ex_05_type_casting;

public class Lab55_Type_Casting_Narrowing {
    public  static void main(String[] args){
        int i=300;
     //   byte b1=i;//Implicit Narrowing. Data loss wil happen
        byte b2= (byte)i; //Expicit Narrowing
        System.out.println(b2); //44
    }
}
