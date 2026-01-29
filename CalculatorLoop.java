// Day 05
// Improved calculator using while loop
// Menu-driven program with exit option

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Calculator");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();

            // Exit
            if (choice == 5) {
                System.out.println("Calculator closed");
                break;
            }

            // Invalid choice (FIXED)
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.println("Enter your first number:");
            int a = sc.nextInt();

            System.out.println("Enter your second number:");
            int b = sc.nextInt();

            if (choice == 1) {
                System.out.println("Result = " + (a + b));
            }
            else if (choice == 2) {
                System.out.println("Result = " + (a - b));
            }
            else if (choice == 3) {
                System.out.println("Result = " + (a * b));
            }
            else if (choice == 4) {
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
            }
        }

        sc.close();
    }
}
