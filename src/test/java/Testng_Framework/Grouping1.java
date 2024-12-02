package Testng_Framework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Grouping1 {
	
	@Test(groups= {"app"})
	public static void apple1()
	{
		System.out.println("apple1");
	}
	@Test(groups= {"app"})
	public static void apple2()
	{
		System.out.println("apple2");
	}
	@Test(groups= {"man"})
	public static void mango1()
	{
		System.out.println("mango1");
	}
	@Test(groups= {"man"})
	public static void mango2()
	{
		System.out.println("mango2");
	}
	
	

	

}
