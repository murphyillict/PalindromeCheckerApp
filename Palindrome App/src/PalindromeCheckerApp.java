import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 4: Character Array Based Palindrome
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by converting it to a character array and comparing
 * characters from both ends.
 *
 * @author Developer
 * @version 4.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String word = sc.next();

        // Convert string to character array
        char[] chars = word.toCharArray();
        boolean isPalindrome = true;

        // Compare characters from both ends
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Output the result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}