package LogicalProblems;
import java.util.*;

public class CheckArmstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num; 
		int n = 3;
		int sum=0;
		for(int i = 1; i<=n; i++) {
			int digit = num%10;
		    sum = sum + (digit * digit * digit);
			num = num/10;
		}
		
		if(original == sum) {
			System.out.print("it is Armstrong Number");
		}else {
			System.out.print("it is Not Armstrong Number");
		}
    
	}	
}