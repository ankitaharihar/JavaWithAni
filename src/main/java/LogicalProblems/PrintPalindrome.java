package LogicalProblems;

public class PrintPalindrome {
	public static void main(String[] args) {
		int num = 123521;
		int orgNum = num;
		int reveNum = 0;

		while (num != 0) {
			int digit = num % 10;
			reveNum = reveNum * 10 + digit;
			num /= 10;
		}

		if (orgNum == reveNum) {
			System.out.println(orgNum + " is a palindrome.");
		} else {
			System.out.println(orgNum + " is not a palindrome.");
		}
	}

}
