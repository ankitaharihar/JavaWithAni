package LogicalProblems;

public class PrintEvenNto1 {
	public static void main(String[] args) {
		int n = 10;
		for (int i = n; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
