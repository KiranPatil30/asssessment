package test.java;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.CodingExample;
import main.java.CollectionProblem;

public class TestCollectionProblems {
	
	
	CollectionProblem obj;
	Scanner sc = new Scanner(System.in);
	@BeforeEach
	public void setUp() throws SQLException{
		obj = new CollectionProblem();
		
	}
	
	@Test
	public void testExtractPortionList() {
		List<String> actualList = obj.extractPortionList();
		List<String> expectedList = new ArrayList<>();
		expectedList.add("Mango");
		expectedList.add("Pineapple");

		
		assertEquals(expectedList , actualList);
		
	}
	
}
