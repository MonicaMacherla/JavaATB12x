package com.ex_16_Arrays;

public class Lab96_Arrays {
    public static void main(String[] args) {
        int[] marks={87,69,44,90,98};

        System.out.println(marks.length);
        System.out.println(marks[3]);

        String name="Monica";
        String[] name_each_char=name.split("");
        System.out.println(name_each_char);
        char c='A';
        String name1 = "pramod";
       char[] name_each_element_char = name1.toCharArray();
        // ["p","r","o","m","d"]
      for(char d : name_each_element_char){
          System.out.println(d);
      }



    }
}
