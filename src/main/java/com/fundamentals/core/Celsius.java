package com.fundamentals.core;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.printf("That temperature is:" + fahrenheit + " Fahrenheit");
    }
}
