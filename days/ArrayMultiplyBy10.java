public class ArrayMultiplyBy10 {
    public static void main(String[] args) {
        int[] arr = { 2, 43, 6, 48, 34 };

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
        }

        for (int value : arr) {
            System.out.println(value);
        }
    }
}
