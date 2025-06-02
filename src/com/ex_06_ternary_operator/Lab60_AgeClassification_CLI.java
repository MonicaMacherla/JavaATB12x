package com.ex_06_ternary_operator;

public class Lab60_AgeClassification_CLI {

    public static void main(String[] args) {
       String user_input=args[0];
      int age= Integer.parseInt(user_input);

      String res = (age<18)?  "Minor" : ( age <65? "Adult":"Senior");
        System.out.println(res);
    }
}
