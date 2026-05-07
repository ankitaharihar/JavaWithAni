package LogicalProblems;

public class PrintAlternatingSeries {
  
    public static void main(String[] args) {

        int n = 10;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("-" + i + " ");
            } else {
                System.out.print("+" + i + " ");
            }
        }
    }
}


