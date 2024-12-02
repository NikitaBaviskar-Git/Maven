package Testng_Framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry2  {
@Test(retryAnalyzer=Testng_Framework.RetryTest.class)
	public static void test1()
	{
		String s1="heelo";
		String s2="hi";
		Assert.assertEquals(s1, s2);
	}

}
