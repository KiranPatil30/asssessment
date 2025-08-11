package practice_assessment_1;

import java.util.Scanner;

public class Palindrome {
	public static boolean checkPalindrome(String str) {
			String originalString = str;
			String reverse = "";
			
			for(int i=str.length()-1;i>=0;i--) {
				reverse += str.charAt(i);
			}
			
			if(reverse.equals(originalString)) {
				return true;
			}
			
			return false;
			
			
	}
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
