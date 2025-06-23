package com.ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab79_Guessing_Game {
    public static void main(String[] args) {

        Random random=new Random();
        int numberToGuess= random.nextInt(100)+1;
      //  System.out.println(numberToGuess);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");

        int guess ;
        int attempts = 0;
        
        while(true){
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Consume invalid token
                continue;
            }
             guess=sc.nextInt();
             attempts++;


             if(guess<1 ||guess>100){
                 System.out.println("Enter any number from 1 to 100");
             }
            if (guess >numberToGuess){
                System.out.println("Number Entered is high");
            }
            else if (guess<numberToGuess){
                System.out.println("Number entered is low");
            }
            else{
                System.out.println("Correct! You guessed it  in " +attempts +  " attempts");
                break;
            }
        }
    }
}
