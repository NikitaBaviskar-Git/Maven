package MavenDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Practise1_Object {
	@FindBy(id="email")
	public static WebElement Email;
	
	@FindBy(id="password")
	public static WebElement Password;
	
	@FindBy(id="submitBTN")
	public static WebElement LoginButton;
	
	@FindBy(xpath="/html/body/main/div/div/div/div[2]/ul/li[3]/a")
	public static WebElement UpdateButton;
	

}
