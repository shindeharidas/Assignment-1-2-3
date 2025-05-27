// public class HelloWorld {
//     public static void main(String[] args)
//     {
//         System.out.println("Hello, World");
//     }
// }

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();

        // System.out.println("Name: " + name);
        // System.out.println("Age: " + age);

        // scanner.close();


        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter User ID: ");
        // String userId = scanner.nextLine();

        // if (userId.equals("Jake")) {
        //     System.out.println("Name: Jake");
        //     System.out.println("Age: 21");
        // } else {
        //     System.out.println("User ID not found.");
        // }
        // scanner.close();

// Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();

//         int incrementedAge = age + 1;

//         System.out.println("Your age next year will be: " + incrementedAge);

//         scanner.close();

//public class LargestNumber {
  //  public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);
    }
}
    

