import java.util.Scanner;

public class ReturnSecondLastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int secondLastDigit = (num / 10) % 10;

        System.out.println("Second Last Digit = " + secondLastDigit);
    }
}
