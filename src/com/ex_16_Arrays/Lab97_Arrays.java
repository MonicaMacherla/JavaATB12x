package com.ex_16_Arrays;

public class Lab97_Arrays {
    public static void main(String[] args) {
        int[] marks = {1, 2, 3, 4, 5, 6};

        // 2nd way to create the array
        int[] mark2 = new int[5];
        int mark3[] = new int[5]; // Fixed Size

        String[] names = new String[3];
        names[0] = "pramod";
        names[1] = "Amit";
        names[2] = "Yasho";

        System.out.println(marks[0]);
        System.out.println(mark2[0]); //default value of integer is 0 and String is Null
    }
}
