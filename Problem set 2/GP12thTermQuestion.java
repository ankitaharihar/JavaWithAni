public class GP12thTermQuestion {
    public static void main(String[] args) {
        int a = 3;
        int r = 2;
        int n = 12;
        int basic = (int) (a * Math.pow(r, n - 1));

        int alternate = a;
        for (int i = 1; i < n; i++) {
            alternate *= r;
        }

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
