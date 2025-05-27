public class PalindromesInRange {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers from 1 to 100 are:");

        for (int i = 1; i <= 100; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }
}
