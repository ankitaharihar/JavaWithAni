public class LastDigitFiveCheck {
    public static void main(String[] args) {
        int number = 125;
        String basic = number % 10 == 5 ? "Yes" : "No";

        String text = Integer.toString(number);
        String alternate = text.charAt(text.length() - 1) == '5' ? "Yes" : "No";

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
