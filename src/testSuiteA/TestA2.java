package testSuiteA;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestA2 {
	

	@Test
	public void testA2_1(){
		
		throw new SkipException("Skipping the test");
	}
	
	@Test
	public void testA2_2(){
		
	}
	
	@Test
	public void testA2_3(){
		
	 Assert.fail("failed test case");
	 		
	}
	

}
