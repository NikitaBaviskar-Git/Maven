package MavenDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_Object {

	@FindBy(id="user-name")
	public static WebElement Username;
	@FindBy(id="password")
	public static WebElement Password;
	@FindBy(id="login-button")
	public static WebElement Login;
	
	

}
