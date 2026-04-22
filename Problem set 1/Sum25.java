public class Sum25 {
    public static void main(String[] args) {
        int a = 1, d = 3, n = 25;
        int sum = n * (2 * a + (n - 1) * d) / 2;
        System.out.println("Sum of first 25 terms: " + sum);
    }
}
