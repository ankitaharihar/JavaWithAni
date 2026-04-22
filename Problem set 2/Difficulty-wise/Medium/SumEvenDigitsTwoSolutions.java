public class SumEvenDigitsTwoSolutions {
    public static void main(String[] args) {
        int number = 1234;

        int n1 = number;
        int basic = 0;
        while (n1 > 0) {
            int digit = n1 % 10;
            if (digit % 2 == 0) {
                basic += digit;
            }
            n1 /= 10;
        }

        String text = Integer.toString(number);
        int alternate = 0;
        for (int i = 0; i < text.length(); i++) {
            int digit = text.charAt(i) - '0';
            if (digit % 2 == 0) {
                alternate += digit;
            }
        }

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
