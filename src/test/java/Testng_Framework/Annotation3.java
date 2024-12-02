package Testng_Framework;

import org.testng.annotations.Test;
//For parallel TestCase Running 
public class Annotation3 {
	@Test(priority=1)
	public static void Amzlogin()
	{
		System.out.println("Amzlogin");
		
	}
	@Test(priority=2)
	public static void Amzaddtocart()
	{
		System.out.println("Amzaddtocart");
		
	}

}
