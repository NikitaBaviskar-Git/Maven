package Testng_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Grouping {
	
	static WebDriver driver;
	@Test
	public static void verifyHomepageTitle() {
	driver=new ChromeDriver();
	driver.get("https://www.phptravels.net/login");
	String expectedTitle = "ABCD";
	String actualTitle = driver.getTitle();
	
	}
	@Test
	public static void newpage() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
/*
public static void main(String[] args)  {
 
	verifyHomepageTitle();
	newpage();
}
*/
}
