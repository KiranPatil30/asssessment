package com.example.testngproject.OpenMRSWebsiteTesting;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class MyTest {
	@Test
	   public void testSuccess() {
	       System.out.println("Executing testSuccess...");
	   }
	 

	    @Test
    public void testFail() {
        System.out.println("Skipping testFail...");
        throw new SkipException("Skipping this test intentionally");
    }
}
