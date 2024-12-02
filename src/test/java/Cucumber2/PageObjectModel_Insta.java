package Cucumber2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel_Insta {
	public static WebElement Username(WebDriver driver)
	{
		return driver.findElement(By.name("username"));
	}
	
	public static WebElement Password(WebDriver driver)
	{
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement Login(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/section/main/article/div[2]/div[1]/div[2]/div/form/div/div[3]"));
	}
	
	
	
	
	

}
