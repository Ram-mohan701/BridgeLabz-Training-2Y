
package String;
import java.util.Scanner;

public class StringCompare {
    
    
    public static boolean compareStrings(String str1, String str2) {
        
        if (str1.length() != str2.length()) {
            return false;
        }

        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        
        boolean customResult = compareStrings(str1, str2);

    
        boolean builtInResult = str1.equals(str2);

        
        System.out.println("Comparison using charAt(): " + customResult);
        System.out.println("Comparison using equals(): " + builtInResult);

    
        if (customResult == builtInResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results differ.");
        }

        sc.close();
}
}
