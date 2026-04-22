public class SumEvenDigitsTwoSolutions {
    public static void main(String[] args) {
        int num = 1234, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0)
                sum += digit;

            num /= 10;
        }

        System.out.println("Even sum: " + sum);
    }
}
