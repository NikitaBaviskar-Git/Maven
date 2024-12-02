package MavenDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		PageFactory.initElements(driver,Page_Object.class);
		Page_Object.Username.sendKeys("standard_user");
		
		Page_Object.Password.sendKeys("secret_sauce");
		
		Page_Object.Login.click();
	}

}
