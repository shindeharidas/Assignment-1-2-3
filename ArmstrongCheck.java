import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length(); // Number of digits

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }

        if (result == originalNumber)
            System.out.println(originalNumber + " is an Armstrong number.");
        else
            System.out.println(originalNumber + " is not an Armstrong number.");
    }
}
