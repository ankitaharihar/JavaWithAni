public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2024;
        String basic = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "Leap Year" : "Not Leap Year";

        String alternate;
        if (year % 400 == 0) {
            alternate = "Leap Year";
        } else if (year % 100 == 0) {
            alternate = "Not Leap Year";
        } else if (year % 4 == 0) {
            alternate = "Leap Year";
        } else {
            alternate = "Not Leap Year";
        }

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
