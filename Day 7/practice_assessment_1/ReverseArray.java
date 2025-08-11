package practice_assessment_1;

import java.util.Scanner;

public class ReverseArray {

	public static void reverseArray(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
		
		//or 
		
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		System.out.println("Reverse array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array:");
		int length = sc.nextInt();
		
		int arr[] = new int[length];
		System.out.println("Enter the number into the array: ");
		for(int i=0;i<length;i++) {
			arr[i] = sc.nextInt();
		}
		
		ReverseArray.reverseArray(arr);
		

	}

}
