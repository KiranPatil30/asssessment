package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodingExample {
		Scanner sc = new Scanner(System.in);
		public String reverseTable(int num) {
			StringBuilder sb = new StringBuilder();
			
			for(int i=10;i>0;i--) {
				sb.append((i * num)+" ");
			}
			
			return sb.toString().trim();
		}
		
		public String printAlphabet() {
			StringBuilder sb = new StringBuilder();
			for(char i = 'a'; i <= 'z';i++) {
				sb.append(i+" ");
			}
			return sb.toString().trim();
		}
		
		public String printASCII() {
			StringBuilder sb = new StringBuilder();
			for(char i = 'a'; i <= 'z';i++) {
				sb.append(i + "->" + (int) i);
			}
			
			return sb.toString().trim();
			
		}
		
		public int factorialNumber(int num) {
			int fact = 1;
			
			for(int i=num;i>0;i--) {
				fact *= i;
			}
			
			return fact;
		}
		
		public int[] numberOfCount(int arr[]) {
			int countPositive=0;
			int countNegative=0;
			int countZero =0;
			
			for(int i:arr) {
				if( i > 0) {
					countPositive++;
				}else {
					if(i < 0) {
						countNegative++;
					}
					else
					{
						countZero++;
					}
				}
			}
			
			int ans[] = {countPositive,countNegative,countZero};
			return ans;
		}
		
		public int[] smallestAndLargest(int arr[]) {
			
			
			int largest = Integer.MIN_VALUE;
			int smallest = Integer.MAX_VALUE;
			
			for(int i:arr) {
				if(i > largest) {
					largest = i;
				}else
				{
					if(smallest > i) {
						smallest = i;
					}
				}
			}
			int ans[] = {largest, smallest};
			return ans;
			
		}
		
		public int sumOfDivisibleByNine() {
			int sum = 0;
			
			for(int i=100;i<200;i++) {
				if( i%9 == 0) {
					sum += i;
				}
			}
			System.out.println(sum+" =");
			return sum;
		}
		
		public int onesCompliment(int n) {
			int ans;
			
			ans = ~n;
			System.out.println(ans);
			return ans;
		}
		
		public int twosCompliment(int n) {
			int ans;
			
			int oneCompliment =   ~n;
			
			ans = (oneCompliment + 1);
			
			System.out.println("->"+ ans);
			return ans;
		}
		
		public int[] fibonacci(int n) {
			
			int a = 0;
			int b = 1;
			int c = 0;
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
			System.out.println(" "+ a);
			arr[i] = a;
			c = a+b;
			a = b;
			b = c;
			}
			
			return arr;
		}
		
		
		// 1 to 5
		public Character higestFrequencyChar() {
			String str = "aaabbbbeee";
			
			HashMap<Character, Integer>map = new HashMap<>();
			for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }
			
			int maxFrequency =0;
			char maxChar = ' ';
			
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				if(maxFrequency < entry.getValue()) {
					maxFrequency = entry.getValue();
					maxChar = entry.getKey();
					}
			}
			
			 return maxChar;  
			

		}
		
		public String replaceFirstVowel() {
			String str = "oer epwer iuer";
			
			StringBuilder sb = new StringBuilder(str);

		    for (int i = 0; i < sb.length(); i++) {
		        char ch = sb.charAt(i);

		        if ("aeiouAEIOU".indexOf(ch) != -1) {
		            sb.setCharAt(i, '-'); 
		            break; 
		        }
		    }
		    
		    return sb.toString();
		}
		
		public int[] countAll() {
			String str = "ae12@";
			
			int countAlpha = 0;
			int countDigit =0;
			int countSpecialCh =0;
			
			for(int i=0;i<str.length();i++) {
		        char ch = str.charAt(i);

		        if((ch >= 'a'&& ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
		            countAlpha++;
		        }
		        else if(ch >= '0' && ch <= '9'){
		            countDigit++;
		        }
		        else {
		            countSpecialCh++;
		        }
			}
			int ans[] = {countAlpha,countDigit,countSpecialCh};
			return ans;
		}
		
		public String replaceBlank(String str) {
			return str.replace(" ", "");
		}
		
		public String concatenate(String str1 , String str2) {
			return str1 +" "+ str2;
		}
		
}
