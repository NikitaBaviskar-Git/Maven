package KeyDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {

	public static WebDriver driver;
	
	public static void openurl() {
	 driver=new ChromeDriver();
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void username() {

	WebElement username1=driver.findElement(By.name("username"));
	username1.sendKeys("admin"); }
	
	public static void password() {
	WebElement pwd=driver.findElement(By.name("password"));
	pwd.sendKeys("admin123");}
	
	public static void login() {
	WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	login.click();
	}
	
}

