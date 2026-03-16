public class UseCase13 {

    public static boolean simplePalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "Never odd or even".replaceAll("\\s+", "").toLowerCase();

        long startTime = System.nanoTime();
        boolean result1 = simplePalindrome(input);
        long endTime = System.nanoTime();
        System.out.println("Simple Strategy: " + (endTime - startTime) + " ns, Result: " + result1);

        startTime = System.nanoTime();
        boolean result2 = recursivePalindrome(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        System.out.println("Recursive Strategy: " + (endTime - startTime) + " ns, Result: " + result2);

    }
}