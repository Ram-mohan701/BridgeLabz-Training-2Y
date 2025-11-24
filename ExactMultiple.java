import java.util.Scanner;

public class ExactMultiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.print("Enter M: ");
        int M = sc.nextInt();

        if (N % M == 0) {
            System.out.println("Yes, N is an exact multiple of M.");
        } else {
            System.out.println("No, N is not an exact multiple of M.");
        }
    }
}
