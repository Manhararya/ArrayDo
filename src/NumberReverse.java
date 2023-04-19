import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        //Enter any single digit number
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter 5 Digit Number");
        int number=scanner.nextInt();
        int reverse=0;
        while (number!=0){
            int reminder=number%10;
            reverse=reverse*10+reminder;
            number=number/10;
        }
        System.out.println("The reverse of the given number is: "+ reverse);
    }
}
