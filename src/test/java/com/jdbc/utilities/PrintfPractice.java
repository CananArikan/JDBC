package com.jdbc.utilities;

import java.util.Date;

public class PrintfPractice {
    public static void main(String[] args) {

        /**
         * s – formats strings
         * d – formats decimal integers
         * f – formats the floating-point numbers
         * t – formats date/time values
         */

        // %15s = allocates 15 characters and if your string has 5 characters,
        // rest of the space will be empty.

        System.out.println();

        int a = 10;
        int b = 20;
        String str1 = "String1";

        System.out.printf("1:%-10d-%d-%d-%s", a, b, a, str1);

        System.out.println("\n================");
        // 1:10        -20-10-String1

        int x = 1;
        String str = "Hello";
        System.out.printf("2:%15s | %10d", str, x);
        // __________Hello | __________1
        System.out.println();
        System.out.printf("3:%-6s%d", str, x);
        // 3:Hello 1
        System.out.println("\n=========================");

        String str3 = "Hello World!";
        System.out.printf("Printing a string in uppercase: %S\n", str3);
        // Printing a string in uppercase: HELLO WORLD!
        System.out.println("=========================");

        System.out.printf("%-15s | %-10d", str, x);
        // Hello__________ | 1_________
        System.out.println("\n=========================");

        float f = 10.9f;
        System.out.printf("f=%-7.2f\n", f);
        // f=10.90
        System.out.printf("Printing a floating point number: f=%7.2f\n", f);
        // Printing a floating point number: f=  10.90

        // 10.9 + 2.12 = 13.02
        float f1 = f + 2.12f;

        System.out.printf("4:%7.2f", f1);
        // 4:  13.02
        System.out.println();
        System.out.printf("4:%f", f1);
        // 4:13.020000
        System.out.println("\n=========================");

        Date date = new Date();
        System.out.printf("Printing current data and time: %tc", date);
        // Printing current data and time: Wed Jun 03 20:11:03 EDT 2020

    }
}
