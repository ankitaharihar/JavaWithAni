package LogicalProblems;

public class SumFirstNto1natural {
	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		for (int i = n; i >= 1; i--) {
			sum += i;
		}
		System.out.println("Sum of first " + n + " natural numbers is: " + sum);
	}

}
