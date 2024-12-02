package Cucumber2;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"C:\\Users\\HP\\eclipse-workspace\\MavenProject\\src\\test\\resources\\Features\\Instagram.feature"},
		glue= {"Cucumber2"},
		plugin= {"pretty","html:target/htmlreports.html"})

public class testrunner extends AbstractTestNGCucumberTests
{
	

}
 
