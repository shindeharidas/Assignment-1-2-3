public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 1000 are:");

        for (int i = 1; i <= 1000; i++) {
            int number = i;
            int originalNumber = number;
            int result = 0;
            int digits = String.valueOf(number).length();

            while (number != 0) {
                int digit = number % 10;
                result += Math.pow(digit, digits);
                number /= 10;
            }

            if (result == originalNumber) {
                System.out.println(originalNumber);
            }
        }
    }
}
