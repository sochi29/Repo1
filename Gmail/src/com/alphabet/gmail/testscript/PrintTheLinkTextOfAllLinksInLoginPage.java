package com.alphabet.gmail.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintTheLinkTextOfAllLinksInLoginPage extends BasicSettings3 {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<=allLinks.size()-1;i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
		
		System.out.println("=========================");
		
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
		
		//driver.close();

	}

}
