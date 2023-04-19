import java.util.Scanner;

public class DigitNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Enter any 5 single digit number
        System.out.println("Please enter 5 Digit Number");

        int number = scanner.nextInt();
        int reverse = 0;

        while (number != 0) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
