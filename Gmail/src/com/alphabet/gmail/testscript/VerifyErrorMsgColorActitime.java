package com.alphabet.gmail.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyErrorMsgColorActitime extends BasicSettings3{

	public static void main(String[] args) {
		WebDriver driver=setUp();
		driver.findElement(By.id("loginButton")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try
		{
		String expectedColor="rgba(206, 1, 0, 1)"; 
		String path="//span[text()='Username or Password is invalid. Please try again.']";
		String actualColor= driver.findElement(By.xpath(path)).getCssValue("color");
		System.out.println(actualColor);
		if(actualColor.equals(expectedColor))
		{
			System.out.println("Pass!!!!Error Msg color is correct");
		}
		else
		{
			System.out.println("Fail!!!!Error Msg color is not correct");
		}
		}
		catch(Exception e)
		{
			System.out.println("No such element"+e);
		} 
		
		
		

	}

}
