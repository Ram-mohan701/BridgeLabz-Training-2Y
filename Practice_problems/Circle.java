package Practice_problems;


import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        
        double area = Math.PI * radius * radius;

        
        System.out.println(area);
        
        
    }
}

