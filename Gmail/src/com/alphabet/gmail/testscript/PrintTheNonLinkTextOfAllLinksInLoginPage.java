package com.alphabet.gmail.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintTheNonLinkTextOfAllLinksInLoginPage extends BasicSettings3 {
	
public static void main(String[] args) {
		
		WebDriver driver = setUp();
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<=allLinks.size()-1;i++)
		{
			boolean text=allLinks.get(i).isDisplayed();
			if(text) 
			{
			System.out.println(allLinks.get(i).getText());
			}
		}
		
		System.out.println("=========================");
		
		for(WebElement link:allLinks)
		{
			boolean linksDisplay=link.isDisplayed();
			if(linksDisplay) 
			{
			System.out.println(link.getText());
			}
			
		}
		
		driver.close();
}

}
