package com.alphabet.gmail.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class GettingDataFromPropertyFile extends BasicSettings3
{

	public static void main(String[] args) throws IOException 
	{
		String path="E:\\Ruchi Qspider\\Selenium program\\Property files\\config1.properties";
		FileInputStream propertyFile=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(propertyFile);
		String url = prop.getProperty("appUrl");
		String user = prop.getProperty("userName");
		String pwd = prop.getProperty("pwd");
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();

	}
}