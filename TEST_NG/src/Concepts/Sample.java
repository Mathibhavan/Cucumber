package Concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test(retryAnalyzer=Retry_Analyzer.class)
	public void Failed() {
		Assert.assertTrue(false);
		System.out.println("Google is working fine");
	}
	
	
   
}

