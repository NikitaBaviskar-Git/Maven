package Testng_Framework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {
	//Parametrisation
		@Test
		@Parameters("Username")
		public static void Username(String name)
		{
			System.out.println(name);
		}
}
