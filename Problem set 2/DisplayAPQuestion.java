public class DisplayAPQuestion {
    public static void main(String[] args) {
        int a = 11;
        int d = 4;

        StringBuilder basic = new StringBuilder();
        int current = a;
        for (int i = 0; i < 10; i++) {
            basic.append(current).append(i == 9 ? "" : " ");
            current += d;
        }

        StringBuilder alternate = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int term = a + i * d;
            alternate.append(term).append(i == 9 ? "" : " ");
        }

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
