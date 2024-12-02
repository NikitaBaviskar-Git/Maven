package MavenDataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Practice2_Object {
	@FindBy(id = "email")
	public static WebElement username;
	
	@FindBy(id = "password")
	public static WebElement password;
	
	@FindBy(id = "submitBTN")
	public static WebElement login;
	
	@FindBy(xpath="/html/body/main/div/div/div/div[2]/ul/li[3]/a")
	public static WebElement profile;
	
	@FindBy(id = "First Name")
	public static WebElement Fname;
	
	
	
}
