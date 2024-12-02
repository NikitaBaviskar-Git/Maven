package MavenDataDriven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

		static Logger logger=LogManager.getLogger(Demo2.class);
		//factory design pattern
			public static void main(String[] args) {
				
				
				logger.debug("this is a debug message");
				logger.info("this is a info message");
				logger.warn("this is a warn message");
				logger.error("this is a error message");
				logger.fatal("this is a fatal message");

	}

}
