package LogicalProblems;

public class FibonacciNto1 {
	public static void main(String[] args) {
		int n = 10;
		int a = 0, b = 1;
		for (int i = n; i >= 1; i--) {
			System.out.println(a);
			int temp = a;
			a = b;
			b = temp + b;
		}
	}

}
