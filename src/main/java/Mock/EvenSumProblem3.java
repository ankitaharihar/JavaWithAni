package Mock;

public class EvenSumProblem3 { 

    public static int calculateSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        return sum;
    }
}