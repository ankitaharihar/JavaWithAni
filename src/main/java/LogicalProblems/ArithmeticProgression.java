package LogicalProblems;

public class ArithmeticProgression {
	public static void main(String[] args) {
	        int a = 2, d = 3, n = 5;

	        int term = a;
	        for (int i = 1; i <= n; i++) {
	            System.out.println(term);
	            term = term + d;
	        }
	    }
	}


