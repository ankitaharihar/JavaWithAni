package LogicalProblems;

public class SeriesPattern {
      public static void main(String[] args) {
	        int n = 6;
	        int num = 2;

	        for (int i = 1; i <= n; i++) {
	            System.out.println(num);

	            if (i % 2 == 1) {
	                num = num * 3;
	            } else {
	                num = num + 1;
	            }
	        }
	    }
	}


