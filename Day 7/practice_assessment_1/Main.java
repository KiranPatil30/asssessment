package practice_assessment_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Palindrome obj = new Palindrome();
		boolean ans = obj.checkPalindrome(str);
		if(ans) {
			System.out.println(str + " this is palindrome string");
		}
		else
		{
			System.out.println(str + " this is not a palindrome string");
		}
		

	}

}
