package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("This is a sample Java application.");
        // You can add more functionality here as needed.
        System.out.println("Additional functionality can be added here.");

        // write functionality to read input from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your name: ")
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the Java application.");
        
    }
}
