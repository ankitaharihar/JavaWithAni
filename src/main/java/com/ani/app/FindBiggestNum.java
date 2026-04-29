package com.ani.app;

public class FindBiggestNum {
	public static void main(String[] args) {
		int[] arr = {24,75,45,89,90};
		
		int largest=  arr[0] ;
		for (int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		int SecondLargest = arr[0];
		for (int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] != largest && arr[i] > SecondLargest) {
				SecondLargest = arr[i];
			}
		}
		
		int ThirdLargest = arr[0];
		for (int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] != SecondLargest && arr[i] > ThirdLargest && arr[i] != largest) {
				ThirdLargest = arr[i];
			}
		}
		System.out.println("Largest num is  " + largest);
		System.out.println("SecondLargest num is  " + SecondLargest);
		System.out.println("ThirdLargest num is  " + ThirdLargest);
	}
	

}
