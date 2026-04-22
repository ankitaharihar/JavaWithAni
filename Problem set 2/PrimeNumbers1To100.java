import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers1To100 {
    public static void main(String[] args) {
        List<Integer> basic = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            int divisors = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisors++;
                }
            }
            if (divisors == 2) {
                basic.add(i);
            }
        }

        List<Integer> alternate = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                alternate.add(i);
            }
        }

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
