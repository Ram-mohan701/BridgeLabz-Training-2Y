import java.util.Scanner;

public class SumOfLastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int last1 = num1 % 10;   // last digit of first number
        int last2 = num2 % 10;   // last digit of second number

        int sum = last1 + last2;

        System.out.println("Sum of last digits = " + sum);
    }
}
