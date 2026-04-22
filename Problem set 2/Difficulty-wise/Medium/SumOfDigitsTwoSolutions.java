public class SumOfDigitsTwoSolutions {
    public static void main(String[] args) {
        int number = 1234;

        int n1 = number;
        int basic = 0;
        while (n1 > 0) {
            basic += n1 % 10;
            n1 /= 10;
        }

        String text = Integer.toString(number);
        int alternate = 0;
        for (int i = 0; i < text.length(); i++) {
            alternate += text.charAt(i) - '0';
        }

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
