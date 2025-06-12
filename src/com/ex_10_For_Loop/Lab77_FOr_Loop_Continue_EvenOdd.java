package com.ex_10_For_Loop;

public class Lab77_FOr_Loop_Continue_EvenOdd {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {

            if(i%2==0){
                System.out.println("Even" +i);
                continue;
            }
            else{
                System.out.println("Odd" +i);
            }

        }
    }
}
