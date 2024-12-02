package Cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginTest {
	static WebDriver driver;
	
@Given("Open Browser")
public void open_browser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.saucedemo.com/");
	
    }

@Then("Enter Username {string}")
public void enter_username(String name) {
	PageObjectModel.username(driver).sendKeys(name);;
}

@And("Enter Password {string}")
public void enter_password(String pwd) {
	PageObjectModel.Password(driver).sendKeys(pwd);
}

@Then("Click Login button")
public void click_login_button() {
	//driver.findElement(By.id("login-button")).click();
	PageObjectModel.Login(driver).click();
    
}
@Then("Verify Login data")
public void verify_login_data() {
  //WebElement Update =driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input"));
  //Update.isDisplayed()," Login Success";
}
@Then("Close the Browser")
public void close_the_browser() {
	driver.close();
    
}
}
