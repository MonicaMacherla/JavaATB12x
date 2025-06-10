package com.ex_09_Switch;

public class Lab67_Interview {

    public static void main(String[] args) {
        // in JDK > 13 // if we use '->' then no need of break
        int itemCode = 001;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
