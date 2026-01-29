// Learnt variables in java and how it works in java

class Variables{
  public static void main( String args [])
  { 
    int a=10;
    int b=20;
    System.out.println(a+b);
  }
}

// Program to demonstrate variables and addition in java
class Variables{
  public static void main ( String args[] )
  {
    int num1=10;
    int num2=20;
    int sum=num1+num2;
      System.out.println("sum="+sum);
  }}
    
// learnt user input
import java.util.Scanner;
class Variables 
  {
  public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      System.out.println(x+y);
    }
  }

// Another program of user input of adding to numbers using scanner function.This code output makes user understable
import java.util.Scanner;
class Variables 
  {
  public static void main (String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your first number");
      int x = sc.nextInt();
      System.out.println("Enter your second number");
      int y = sc.nextInt();
      System.out.println("Sum of the two numbers:");
      System.out.println(x+y);
    }
  }
