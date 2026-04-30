package LogicalProblems;

public class PrintPowerSeries {
	public static void main(String[] args) {
		int n = 5;
		int base = 2;
		for (int i = 0; i <= n; i++) {
			System.out.println((int) Math.pow(base, i));
		}
	}

}
