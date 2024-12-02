package Cucumber2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Instagram {
	static WebDriver driver;

@Given("Launch Browser")
public void launch_browser() {
	driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Then("Enter Username {string}")
public void enter_username(String uname) {
	
	PageObjectModel_Insta.Username(driver).sendKeys(uname);
}

@Then("Enter Password {string}")
public void enter_password(String pwd) {
	
	PageObjectModel_Insta.Password(driver).sendKeys(pwd);
}
/*
@Then("Enter Username")
public void enter_username() {
	WebElement Username = driver.findElement(By.name("username"));
	Username.sendKeys("Nikita");
	
}

@And("Enter Password")
public void enter_password() {
	WebElement Password = driver.findElement(By.name("password"));
	Password.sendKeys("Nikita@123");
}
*/
@Then("Click on Login button")
public void click_on_login_button() {
	PageObjectModel_Insta.Login(driver).click();
	
}
@And("Verify Login")
public void verify_login() {
    System.out.println("Done...!!!");
}

@Then("Close the Browser")
public void close_the_browser() {
    driver.close();
}
}
