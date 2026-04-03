package days;

class Reverse {
    public static void main(String[] args) {
        int[] arr = {67, 25, 89, 12, 34, 56};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}