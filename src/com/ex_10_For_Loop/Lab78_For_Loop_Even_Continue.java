package com.ex_10_For_Loop;

public class Lab78_For_Loop_Even_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {

            if(i%2==0){

                continue; //continue means Skip
            }

                System.out.println("Odd ->" +i);


        }
    }
}
