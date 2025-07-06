package com.ex_16_Arrays;

public class Lab98_ArraysPart2 {
    public static void main(String[] args) {
        String[] names={"Monica", "Rakesh","Sree"};
        System.out.println(names.length);
        System.out.println(names[0]);

        String[] atb12x=new String[3];
        atb12x[0]="Siri";
        atb12x[1]="Ravi";
        atb12x[2]="Giri";

        System.out.println(atb12x[1]);

        boolean[] is_male_data= new boolean[2];
        is_male_data[0]=true;
        is_male_data[1]=false;

        System.out.println(is_male_data[0]);
    }
}
