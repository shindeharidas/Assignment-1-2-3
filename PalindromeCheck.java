public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 242;
        int originalNumber = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;         
            reversed = reversed * 10 + digit; 
            number /= 10;                   
        }

        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
