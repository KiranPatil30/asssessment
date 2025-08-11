package test.java;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import main.java.Operation;

public class OperationTest {
	Operation obj;
		@BeforeEach
		public void setUp(){
			obj = new Operation();
		}
		
		@BeforeEach
		public void getConn() throws SQLException{
			obj.connection();
		}
		
		@Test
		public void testInsert() throws SQLException{
				assertEquals(1, obj.insert());
		}
		
		@Disabled("i will skip this test") 
		@Test
		public void testDelete() throws SQLException{
			System.out.println("count"+obj.delete());
			assertEquals(1,obj.delete());
		}
		
		
		@DisplayName("Testing update function")
		@Test
		public void testUpdate() throws SQLException{
			assertEquals(0,obj.delete());
		}
		
		@AfterEach
		public void closeConn() throws SQLException{
			obj.closeConnection();
		}
		
		
		
}
