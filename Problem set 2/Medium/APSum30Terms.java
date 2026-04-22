public class APSum30Terms {
    public static void main(String[] args) {
        int a = 6;
        int d = 3;
        int n = 30;
        int basic = (n * (2 * a + (n - 1) * d)) / 2;

        int alternate = 0;
        int current = a;
        for (int i = 0; i < n; i++) {
            alternate += current;
            current += d;
        }

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
