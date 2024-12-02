package Testng_Framework;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener{
	
	public void OnTestFailure(ITestResult Result)//when Particular Testcase fail
	{
		System.out.print("failed");
	try {
		DataProviderExample.Screenshot();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	
	}
	

}
