package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.sql.SQLException;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;
import main.java.Operation;

public class OperationTest {
	Operation obj;
		@BeforeEach
		public void setUp() throws SQLException{
			obj = new Operation();
			obj.connection();
		}
	

		@Test
		@DisplayName("Record Inserted!")
		public void testInsert() throws SQLException{
			int count = obj.insert();
			System.out.println("Row inserted: "+ count);
			assertEquals(4, count);
			assertNotEquals(0, count);
			
		}
		
		@DisplayName("Test update function")
		@Test
		public void testUpdate() throws SQLException{
			obj.update();
			
			assertEquals(1,obj.update());
			
		}
		
//		@Disabled("i will skip this test") 
		@DisplayName("This delete test skipp ")
		@Test
		public void testDelete() throws SQLException{
			 int count = obj.delete();
			System.out.println("cou"+count );
			assertEquals(0,count);
		}
		
		
		
		
		@AfterEach
		public void closeConn() throws SQLException{
			obj.closeConnection();
		}
		
		
		
}
