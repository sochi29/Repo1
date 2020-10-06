package com.alphabet.gmail.testscript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class ErrorMsgScreenShot extends BasicSettings3
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=setUp();
		driver.findElement(By.id("loginButton")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try
		{
		 
		String path="//span[text()='Username or Password is invalid. Please try again.']";
		File srcfile= driver.findElement(By.xpath(path)).getScreenshotAs(OutputType.FILE);
		File srcfile1= driver.findElement(By.id("whiteBoxWithLogoBody")).getScreenshotAs(OutputType.FILE);
		
		File destfile= new File("./errorshots/errormsg.png");
		File destfile1= new File("./errorshots/panelerrormsg.png");
		FileUtils.copyFile(srcfile, destfile);
		FileUtils.copyFile(srcfile1, destfile1);
		System.out.println("File Copied");
		}
		catch(Exception e)
		{
			System.out.println("File Not Copied");
		}

	}

}
