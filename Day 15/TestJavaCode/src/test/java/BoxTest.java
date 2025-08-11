package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import main.Java.Box;

public class BoxTest {
		Box boxObj = new Box();
		
		@Test
		public void testAreaOfCircle() {
			double a =boxObj.areaOfCircle(10);
			System.out.println(a);
			double delta = 0.1;
			assertEquals(314.15, a, delta);
		}
		
		@Test
		public void areaOfTriangle() {
			double actualOutput= boxObj.areaOfTriangle(10,20);
			double delta = 0.1;
			assertEquals(100.0,actualOutput,delta);
		}
		
		@Test
		 public void testAreaOfSquare() {
				double delta = 0.1;
		        assertEquals(16.0, boxObj.areaOfSquare(4), delta);
		 }

		 @Test
		 public void testAreaOfRectangle() {
			
		        assertEquals(18, boxObj.areaOfRectangle(6, 3));
		 }

		 @Test
		public void testSimpleInterest() {
			 double delta = 0.1;
		        assertEquals(100.00, boxObj.simpleInterest(1000, 5, 2), delta);
		}

		@Test
		public void testAmount() {
			 double delta = 0.1;
			 double a =  boxObj.amount(1000, 5, 2);
			 System.out.println(a);
		        assertEquals(1100.0, boxObj.amount(1000, 5, 2),delta);
		}
}
