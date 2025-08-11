package practice_assessment_1;

import java.util.Scanner;

public class Matrix {
	public static void additionOfMatrix(int arr1[][], int arr2[][], int row, int col) {
		
		int matrix[][] = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]  = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("Additon of Two Matrix: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row: ");
		int row = sc.nextInt();
		
		System.out.println("Enter column");
		int col = sc.nextInt();
		
		int arr1[][] = new int[row][col];
		int arr2[][] = new int[row][col];
		
		System.out.println("Enter a value in Matrix1: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter a value in Matrix2: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		Matrix obj = new Matrix();
		obj.additionOfMatrix(arr1, arr2, row, col);
		
	}

}
