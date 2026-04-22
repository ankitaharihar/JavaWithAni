public class NextTermSquares {
    public static void main(String[] args) {
        int n = 5;
        int basic = n * n;

        int lastTerm = 16;
        int lastDiff = 7;
        int alternate = lastTerm + (lastDiff + 2);

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
