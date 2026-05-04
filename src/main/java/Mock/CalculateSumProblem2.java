package Mock;

class CalculateSumProblem2 {
    public static int calculatesum(int[] a) { 
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        return sum; 
    }
}