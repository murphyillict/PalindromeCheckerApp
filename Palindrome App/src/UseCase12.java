import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

class SimpleStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int start = 0, end = str.length() - 1;
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

class RecursiveStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        return checkRecursive(str, 0, str.length() - 1);
    }

    private boolean checkRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return checkRecursive(str, start + 1, end - 1);
    }
}
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String str) {
        return strategy.isPalindrome(str);
    }
}

public class UseCase12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeContext context = new PalindromeContext();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Choose strategy: 1) Simple  2) Recursive  3) Deque");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                context.setStrategy(new SimpleStrategy());
                break;
            case 2:
                context.setStrategy(new RecursiveStrategy());
                break;
            case 3:
                context.setStrategy(new DequeStrategy());
                break;
            default:
                System.out.println("Invalid choice. Using SimpleStrategy by default.");
                context.setStrategy(new SimpleStrategy());
        }

        if (context.executeStrategy(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}