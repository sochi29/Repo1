package com.alphabet.gmail.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipKartImage extends BasicSettings3 {

	public static void main(String[] args) {
		WebDriver driver=setUp("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.className("_1e_EAo"));
		String actualAltText=element.getAttribute("alt");
		System.out.println("Alternative Text is:-"+actualAltText);
		String expectedAltText="Flipkart";
		if(actualAltText.equals(expectedAltText))
		{
			System.out.println("Alternative Text is correct");
			
		}
		
		else
		{
			System.out.println("Alternative Text is not correct");
		}

	}

}
