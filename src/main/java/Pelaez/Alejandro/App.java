/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        String pass = "abc$123";
        System.out.print("What is the password? ");
        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        if (pass.equals(userInput))
            System.out.print("Welcome!\n");
        else
            System.out.print("I don't know you.\n");

    }
}
