public class DivisibleBy357Check {
    public static void main(String[] args) {
        int number = 105;
        String basic = (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) ? "Yes" : "No";

        boolean div3 = false;
        boolean div5 = false;
        boolean div7 = false;
        for (int i = 1; i <= number; i++) {
            if (i * 3 == number) {
                div3 = true;
            }
            if (i * 5 == number) {
                div5 = true;
            }
            if (i * 7 == number) {
                div7 = true;
            }
        }
        String alternate = (div3 && div5 && div7) ? "Yes" : "No";

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
