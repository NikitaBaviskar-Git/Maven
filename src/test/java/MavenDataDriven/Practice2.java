package  MavenDataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Practice2 {
	public static WebDriver driver;
	
	public static void login() {
		
			
		Practice2_Object.username.sendKeys("user@phptravels.com");
		Practice2_Object.password.sendKeys("demouser");
		Practice2_Object.login.click();
	}
	
	public static void update_profile() {
		System.out.print("Inside Method ");
		Practice2_Object.profile.click();
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
			driver.get("https://www.phptravels.net/login");
			
		PageFactory.initElements(driver, Practice2_Object.class);
		login();
		update_profile();
		
	}

}
