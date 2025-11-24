import java.util.Scanner;

public class CountOdd5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();

            if (num % 2 != 0) {   // odd condition
                count++;
            }
        }

        System.out.println("Total odd numbers = " + count);
    }
}
