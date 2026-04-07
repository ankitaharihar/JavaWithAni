public class Pattern {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("Hi");
            }
            System.out.println();
        }
    }
}