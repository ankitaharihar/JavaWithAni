public class ReverseNumberTwoSolutions {
    public static void main(String[] args) {
        int number = 1234;

        int basic = reverseUsingMath(number);
        String alternate = reverseUsingString(number);

        System.out.println("Solution 1 (Math): " + basic);
        System.out.println("Solution 2 (String): " + alternate);
    }

    private static int reverseUsingMath(int number) {
        int n = number;
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }

    private static String reverseUsingString(int number) {
        String text = Integer.toString(number);
        StringBuilder reversedText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText.append(text.charAt(i));
        }
        return reversedText.toString();
    }
}
