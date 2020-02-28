import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        System.out.println("Enter a String ");
        Scanner in = new Scanner(System.in);

        String origString = in.nextLine();
        String reverseString = new StringBuilder(origString).reverse().toString();

        if (origString.equals(reverseString)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String not palindrome");
        }

    }
}
