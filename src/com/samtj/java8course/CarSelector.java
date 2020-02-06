package com.samtj.java8course;

public class CarSelector {
    public static void main(String[] arguments ) {
        for (String argument : arguments ) {
            System.out.println( "processing car: " +
                    argument );
        }
    }
}
