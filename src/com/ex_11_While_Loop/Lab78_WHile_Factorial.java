package com.ex_11_While_Loop;

import java.util.Scanner;

public class Lab78_WHile_Factorial {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want");
        if (!sc.hasNextInt()){
            System.out.println("Enter Integer number and rerun the program");
        }
        int num= sc.nextInt();
        int fact=1;

        if(num==0){
            System.out.println(fact);
        }
        if (num > Integer.MAX_VALUE){
            System.out.println("Can't get factorail as the number entered is out of bound!(int)");
        }
        int i=1;

        while(i<=num){
            fact= fact*i;
            i++;

        }
        System.out.println("Factorial is "+fact);

    }
}
