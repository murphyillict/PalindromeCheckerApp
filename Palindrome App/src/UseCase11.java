
class PalindromeService {

    private String normalize(String str) {
        return str.replaceAll("\\s+", "").toLowerCase();
    }

    public boolean isPalindrome(String str) {
        str = normalize(str);

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class UseCase11 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (service.isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}