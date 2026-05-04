package Mock;

public class PrintEvenNumArrayProblem4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		for (int num : arr) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}

}
