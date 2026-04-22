public class DivisibleBy357Check {
public static void main(String[] args) {
        int num = 105;

        if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0)
            System.out.println("Divisible by 3,5,7");
        else
            System.out.println("Not divisible");
    }
}
