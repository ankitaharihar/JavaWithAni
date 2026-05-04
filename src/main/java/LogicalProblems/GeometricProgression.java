package LogicalProblems;

public class GeometricProgression {
	
	    public static void main(String[] args) {
	        int a = 2, r = 3, n = 5;

	        int term = a;
	        for (int i = 1; i <= n; i++) {
	            System.out.println(term);
	            term = term * r;
	        }
	    }
	}


