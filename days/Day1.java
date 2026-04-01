package days;
public class Day1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7};
        int n = 7;

        int sum = (n*(n+1))/2;
        int arrSum = 0;
        for(int i=0; i<arr.length; i++){
            arrSum += arr[i];
        }
        int missingNum = sum - arrSum;
        System.out.println("The missing number is: " + missingNum);  
    
}
}
