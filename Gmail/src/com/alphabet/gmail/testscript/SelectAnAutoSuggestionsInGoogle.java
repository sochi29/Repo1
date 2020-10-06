package com.alphabet.gmail.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectAnAutoSuggestionsInGoogle extends BasicSettings3 {

	
		public static void main(String[] args) 
		{
			WebDriver driver = setUp("https://www.google.com");
		   WebElement element=	driver.findElement(By.name("q"));
				element.sendKeys("Cucumber");
			
			//mySleepInSeconds(5);
			WebDriverWait rv=new WebDriverWait(driver,20);
			rv.until(ExpectedConditions.textToBePresentInElement(element, "Cucumber"));
			
			String suggestionsXpath = "//li[@class='sbct' or @class='sbct sbre']";
			List<WebElement> suggestions = driver.findElements(By.xpath(suggestionsXpath));
			
			for(WebElement suggestion:suggestions)
			{
				if(suggestion.getText().contains("gel"))
				{
					System.out.println(suggestion.getText());
					suggestion.click();
					break;
				}
			}
		}

	

}
