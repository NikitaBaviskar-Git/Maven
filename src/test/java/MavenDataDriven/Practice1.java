package MavenDataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Practice1 {
	static WebDriver driver;
	
	public static void Login() {
		
		Practise1_Object.Email.sendKeys("user@phptravels.com");
		Practise1_Object.Password.sendKeys("demouser");
		Practise1_Object.LoginButton.click();
		
	}
	public static void UpdateProfile() {
		System.out.println("Printed !!");
		Practise1_Object.UpdateButton.click();
		
		
	}
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		PageFactory.initElements(driver,Practise1_Object.class);
		Login();
		UpdateProfile();
	}

}
