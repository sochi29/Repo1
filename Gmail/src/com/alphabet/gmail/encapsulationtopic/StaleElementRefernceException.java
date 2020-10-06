package com.alphabet.gmail.encapsulationtopic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class StaleElementRefernceException extends BasicSettings3
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		System.out.println("Hello");
		DemoA d = new DemoA(driver);
		driver.navigate().refresh();
		
		d.setUsername("admin");
		d.setPassword("manager");
	}
}
