package testSuiteB;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestB1 {
	@Test
	public void testB1_1(){
		
		throw new SkipException("Skipping the test");
	}
	
	@Test
	public void testB1_2(){
		
	}
	
	@Test
	public void testB1_3(){
		
	 Assert.fail("failed test case");
	 		
	}
	
}
