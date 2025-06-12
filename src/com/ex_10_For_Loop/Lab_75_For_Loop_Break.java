package com.ex_10_For_Loop;

public class Lab_75_For_Loop_Break {
    public static void main(String[] args){
      for (int i=0;i<50;i++){
         // System.out.println(i); //0,1,2,3,4,5
          if (i==5){
              break;
          }
          System.out.println(i);//0,1,2,3,4
      }
    }
}
