public class GP8thTermQuestion {
    public static void main(String[] args) {
        int a = 2;
        int r = 5;
        int n = 8;
        int basic = (int) (a * Math.pow(r, n - 1));

        int alternate = a;
        for (int i = 1; i < n; i++) {
            alternate *= r;
        }

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
