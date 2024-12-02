package Testng_Framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {
	@Test(priority=1)
	public static void login()
	{
		System.out.println("login");
		
	}
	@Test(priority=2)
	public static void addtocart()
	{
		System.out.println("addtocart");
		
	}
	@Test(priority=3)
	public static void Payment()
	{
		System.out.println("Payment");
		
	}
	@Test(priority=4)
	public static void Logout()
	{
		System.out.println("Logout");
		
	}
	
}
