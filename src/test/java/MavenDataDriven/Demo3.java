package MavenDataDriven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	static Logger logger=LogManager.getLogger(Demo3.class);
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		
		logger.info("Web Page Launched");

	}

}
