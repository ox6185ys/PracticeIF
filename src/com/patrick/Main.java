package com.patrick;
import java.util.*;
public class Main {//push not working
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name here. ");
        String message = scanner.nextLine();
        System.out.print("String Length :" );
        System.out.println(message.length());
        if (message.length() > 10) System.out.println("This is longer than 10");
        else {
            System.out.println("The input is less than 10. ");
        }
        if (message.length() % 2 == 0) System.out.println("There is an even " +
                "number of characters. ");
        else {
            if (message.length() % 2 > 0) System.out.println("The number does " +
                    "not have an even number of characters.");
        }
/*        if (user < 100) System.out.println("That number is less than 100. ");
        else {
            if (user >= 100)
                System.out.println(user +
                        " is 100 or more. ");
        }*//*
        if (user < 100) System.out.println("The number is less than 100. ");
        else {
            if (user == 100)
                System.out.println("The number is equal to 100. ");
            else if (user > 100)
                System.out.println("The number is greater than 100. ");
        }*/
    }
}
