package com.ex_09_Switch;

import java.util.Scanner;

public class Lab62_RealSwitch_Automation {

    // Web Automation
    // I will ask the user to give me the input from browser which he wants to
    // use to I will start the automation in that browser.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the browser where you want to run the code");
        String browser=sc.next();
        browser=browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                System.out.println("........");
                System.out.println("TC3");
                System.out.println("TC4");
                break;
            case "edge":
                System.out.println("Starting the edge");
                System.out.println("........");
                System.out.println("TC5");
                System.out.println("TC6");
                break;

            default:
                System.out.println("I don't have idea which browser is this");
                break;
        }
    }
}
