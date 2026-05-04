package LogicalProblems;
public class Print111Series {
    public static void main(String[] args) {
        int n = 5;
        int num = 0;

        for (int i = 1; i <= n; i++) {
            num = num * 10 + 1;
            System.out.println(num);
        }
    }
}