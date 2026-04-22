public class APSum30Terms {
    public static void main(String[] args) {
        int a = 6, d = 3, n = 30;
        int sum = (n * (2 * a + (n - 1) * d)) / 2;
        System.out.println("Sum: " + sum);
    }
}
