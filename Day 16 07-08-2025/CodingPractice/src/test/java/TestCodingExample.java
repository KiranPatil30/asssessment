package test.java;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.CodingExample;


public class TestCodingExample {
	CodingExample obj;
	Scanner sc = new Scanner(System.in);
	@BeforeEach
	public void setUp() throws SQLException{
		obj = new CodingExample();
		
	}
//	
//	@Test
//	public void testReverTable() {
//		System.out.println("Enter number reverse Table: ");
//		int n = sc.nextInt();
//		String expected = "20 18 16 14 12 10 8 6 4 2";
//		System.out.println(obj.reverseTable(n));
//		assertEquals(expected , obj.reverseTable(n));
//		
//	}
//
//	@Test
//	public void testPrintAlphabet() {
//		String expected = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
//		assertEquals(expected , obj.printAlphabet());
//		
//	}
//	
//	@Test
//	public void testPrintASCII() {
//		String expected = "a->97"
//				+ "b->98"
//				+ "c->99"
//				+ "d->100"
//				+ "e->101"
//				+ "f->102"
//				+ "g->103"
//				+ "h->104"
//				+ "i->105"
//				+ "j->106"
//				+ "k->107"
//				+ "l->108"
//				+ "m->109"
//				+ "n->110"
//				+ "o->111"
//				+ "p->112"
//				+ "q->113"
//				+ "r->114"
//				+ "s->115"
//				+ "t->116"
//				+ "u->117"
//				+ "v->118"
//				+ "w->119"
//				+ "x->120"
//				+ "y->121"
//				+ "z->122";
//		System.out.println(obj.printASCII());
//		assertEquals(expected , obj.printASCII());
//		
//	}
//	
//	@Test
//	public void testFactorialNumber() {
//		System.out.println("Enter number for find the factorial: ");
//		int n = sc.nextInt();// 3
//		int  expected = 6;
//		assertEquals(6 , obj.factorialNumber(n));
//	}
//	
//	@Test
//	public void testNumberOfCount() {
//		System.out.println("Enter the how many number you want to enter: ");
//		int n = sc.nextInt();// 6
//		int arr[] = new int[n];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//	    
//	    int[] expectedArr = {2, 2, 2};
//	    int[] actualAns = obj.numberOfCount(arr);
//	    assertArrayEquals(expectedArr, actualAns);
//	    
//	}
//	
//	@Test
//	public void testSmallestAndLargest() {
//		
//		 	int input[] = {5, 10, 2, -4, 9};
//		    int expected[] = {10, -4};
//		    
//		    int actual[] = obj.smallestAndLargest(input);
//		    
//		    assertArrayEquals(expected, actual);
//	}
//
//	@Test
//	public void testSumOfDivisibleByNine() {
//		int expected = 1683;
//		System.out.println("--"+obj.sumOfDivisibleByNine());
//		assertEquals(expected,obj.sumOfDivisibleByNine());
//		
//	}
//	
//	@Test
//	public void testOnesCompliment() {
//		int expected = -11;
//		System.out.println("ENter number for one compliment: ");
//		int num = sc.nextInt(); // 10
//		int actualOutput = obj.onesCompliment(num);
//		assertEquals(expected,actualOutput);
//		
//	}
//	
//	@Test
//	public void testTwosCompliment() {
//		int expected = -5;
//		System.out.println("ENter number for two's compliment: ");
//		int num = sc.nextInt(); // 5
//		int actualOutput = obj.twosCompliment(num);
//		assertEquals(expected,actualOutput);
//		
//	}
//	
//	@Test
//	public void testFibonacci() {
//		int expected[] = {0 ,1, 1, 2, 3};
//		System.out.println("enter to find fibonnaci ");
//		int num = sc.nextInt(); // 5
//		int actual[] = obj.fibonacci(num);
//		assertArrayEquals(expected,actual);
//		
//	}
	
	
	
	
	
	
	

	@Test
	public void testHigestFrequencyChar() {
		
		int actualOutput = obj.higestFrequencyChar();
		assertEquals('b',actualOutput);
	}
	
	@Test
	public void replaceFirstVowel() {
		String actualStr = obj.replaceFirstVowel();
		assertEquals("-er epwer iuer",actualStr);
	}
	
	@Test
	public void testCountAll() {
		int actualOutput[] = obj.countAll();
		int expectedOutput[] = {2,2,1};
		assertArrayEquals(expectedOutput,actualOutput);
	}
}
