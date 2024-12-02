package Testng_Framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeTest
	public static void m1()
	{
		System.out.println("Before Test");
		
	}
	@Test
	public static void m2()
	{
		System.out.println("Test1");
		
	}
	@Test
	public static void m21()
	{
		System.out.println("Test2");
		
	}
	@AfterTest
	public static void m3()
	{
		System.out.println("AfterTest");
		
	}
	@BeforeClass
	public static void m4()
	{
		System.out.println("BeforeClass");
		
	}
	@BeforeSuite
	public static void m5()
	{
		System.out.println("BeforeSuite");
		
	}
	@AfterClass
	public static void m6()
	{
		System.out.println("AfterClass");
		
	}
	@AfterSuite
	public static void m7()
	{
		System.out.println("AfterSuite");
		
	}
}
