package days;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {67, 25, 89, 12, 34, 56};

        int evenIndex = 0;
        int oddIndex = arr.length - 1;

        while (evenIndex < oddIndex) {
            if (arr[evenIndex] % 2 == 0) {
                evenIndex++;
            } else if (arr[oddIndex] % 2 != 0) {
                oddIndex--;
            } else {
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;
                evenIndex++;
                oddIndex--;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
