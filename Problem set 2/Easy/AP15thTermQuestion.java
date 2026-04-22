public class AP15thTermQuestion {
    public static void main(String[] args) {
        int a = 2;
        int d = 3;
        int n = 15;
        int basic = a + (n - 1) * d;

        int alternate = a;
        for (int i = 1; i < n; i++) {
            alternate += d;
        }

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
