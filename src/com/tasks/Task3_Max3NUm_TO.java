package com.tasks;

public class Task3_Max3NUm_TO {
    public static void main (String[] args){
        int x=35, y=50, z=40;

        int res = (x>y && x>z)?x:(y>z? y:z);
        System.out.println("The Max num is " +res);

    }
}
