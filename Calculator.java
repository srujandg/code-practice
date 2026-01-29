// Day 05: Simple calculator using Scanner and if-else
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number");
        int a = sc.nextInt();

        System.out.println("Enter your second number");
        int b = sc.nextInt();

        System.out.println("Enter your choice: 1-add, 2-sub, 3-mul, 4-div");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Result is " + (a + b));
        } 
        else if (choice == 2) {
            System.out.println("Result is " + (a - b));
        } 
        else if (choice == 3) {
            System.out.println("Result is " + (a * b));
        } 
        else if (choice == 4) {
            if (b != 0) {
                System.out.println("Result is " + (a / b));
            } else {
                System.out.println("Cannot divide by zero");
            }
        } 
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
