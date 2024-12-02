package Cucumber;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features= {"C:\\Users\\HP\\eclipse-workspace\\MavenProject\\src\\test\\resources\\Features\\Login2.feature"},
			glue= {"Cucumber2"},
			plugin= {"pretty","html:target/htmlreport.html"})

	public class TestRunner extends AbstractTestNGCucumberTests
	{
		

}
