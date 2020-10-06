package com.alphabet.gmail.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC001
{

	@Test(description="Test Case to test Login with Valid Credentials")
	public void testValidLogin()
	{
		Reporter.log("Running testValidLogin Method", true);
	}
}
