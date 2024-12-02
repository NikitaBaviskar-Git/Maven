package Testng_Framework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {
	static WebDriver driver;
	@Test(dataProvider="logindata")
	public void logintest(String username,String password) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username); 
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		//SoftAssert softassert=new SoftAssert();//continue further steps
		//Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/aside/nav/div[2]/div/div/input")).isDisplayed());	
		
		//driver.close();
	}
@DataProvider(name="logindata")
public Object[][] login(){
	Object[][] data=new String[2][2];
	data[0][0]="Admin";
	data[0][1]="admin123";
	data[1][0]="Admin";
	data[1][1]="Admin@123";
	
	return data;
	
	
}
public static void Screenshot() throws IOException
{
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(file, new File("D:\\Screenshot\\image1.png"));
}
}