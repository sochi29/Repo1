package com.alphabet.gmail.testscript;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class ElementScreenshotWithSystemDate extends BasicSettings3
{

	public static void main(String[] args) throws IOException
	{
		LocalDateTime ldt = LocalDateTime.now();
		String date=ldt.toString().replace(':', '-');
		System.out.println(date);
		WebDriver driver = setUp();
		File srcFile = driver.findElement(By.id("loginButton")).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/loginButton"+date+".png");
		
		FileUtils.copyFile(srcFile,destFile);

	}

}
