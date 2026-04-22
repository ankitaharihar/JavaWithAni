import java.util.ArrayList;
import java.util.List;

public class DivisorsQuestion {
    public static void main(String[] args) {
        int number = 12;

        List<Integer> basic = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                basic.add(i);
            }
        }

        List<Integer> alternate = new ArrayList<>();
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                alternate.add(i);
                if (i != number / i) {
                    alternate.add(number / i);
                }
            }
        }

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
