package com.prepkaro.javaprepkaro;

public class StringBuilderDemo {

    public static void main(String[] args) {

        // Create String object
        StringBuilder stringBuilder = new StringBuilder();
        // Add a string
        stringBuilder.append("Java");
        //Print a String
        System.out.println(stringBuilder);
        // Append more string
        stringBuilder.append(" StringBuilder Demo");

        System.out.println(stringBuilder);

        stringBuilder.setLength(0);

        System.out.println(stringBuilder);

        stringBuilder.append("Java prepkaro");

        System.out.println(stringBuilder);

        stringBuilder.reverse();

        String output = stringBuilder.toString();

        System.out.println("output :: " + output);

    }

    public static void allSyntax() {
        StringBuilder sbr = new StringBuilder();
        sbr.append("Java"); //
        sbr.append(" ");
        sbr.append("Prepkaro");
        // Convert to String
        String testToString = sbr.toString();
        // Reverse a string
        sbr.reverse();
        sbr.append("\n By Nitish Vashisth"); // To append next line
    }

}
