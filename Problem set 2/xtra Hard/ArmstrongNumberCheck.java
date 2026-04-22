public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        int number = 153;

        int n1 = number;
        int sum1 = 0;
        while (n1 > 0) {
            int digit = n1 % 10;
            sum1 += digit * digit * digit;
            n1 /= 10;
        }
        String basic = sum1 == number ? "Armstrong" : "Not Armstrong";

        int n2 = number;
        int count = 0;
        while (n2 > 0) {
            count++;
            n2 /= 10;
        }

        int n3 = number;
        int sum2 = 0;
        while (n3 > 0) {
            int digit = n3 % 10;
            sum2 += (int) Math.pow(digit, count);
            n3 /= 10;
        }
        String alternate = sum2 == number ? "Armstrong" : "Not Armstrong";

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
