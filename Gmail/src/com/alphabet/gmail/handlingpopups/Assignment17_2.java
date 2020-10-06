package com.alphabet.gmail.handlingpopups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class Assignment17_2 extends BasicSettings3
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=setUp("https://the-internet.herokuapp.com/basic_auth");
		String path="E:\\Ruchi Qspider\\Selenium program\\Class Study Material\\Popups\\FileDownloadPop\\AuthenticationScript.exe";
		Runtime.getRuntime().exec(path);
		boolean isDisplay=driver.findElement((By.xpath("//h3[text()='Basic Auth']"))).isDisplayed();
		if(isDisplay)
		{
			System.out.println("Authentication Happened Successfully!!!!");
		}
       
	}

}
