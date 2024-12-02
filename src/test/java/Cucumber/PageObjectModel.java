package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel {
	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.id("user-name"));
		
	}
	
	public static WebElement Password(WebDriver driver)
	{
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement Login(WebDriver driver)
	{
		return driver.findElement(By.id("login-button"));
	}

	public static WebElement Update(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input"));
	}

	  

}
