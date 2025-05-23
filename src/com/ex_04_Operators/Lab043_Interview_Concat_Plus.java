package com.ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String firstName= "Monica";
        String lastName="Macherla";

        int a=10;
        int b=10;

        System.out.println(firstName + lastName + a+b); //MonicaMacherla1010
        System.out.println(a+b + firstName +lastName); //20MonicaMacherla
        System.out.println(firstName + lastName + (a+b)); //applies BODMAS -> MonicaMacherla20

    }

}
