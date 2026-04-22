public class GPCommonRatioQuestion {
    public static void main(String[] args) {
        int first = 5;
        int second = 15;
        int basic = second / first;

        int alternate = 0;
        int multiple = first;
        while (multiple <= second) {
            alternate++;
            if (multiple == second) {
                break;
            }
            multiple += first;
        }

        System.out.println("Basic: " + basic);
        System.out.println("Alternate: " + alternate);
    }
}
