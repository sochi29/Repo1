package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class Assignment1ClickOnCertification extends BasicSettings3 {

	public static void main(String[] args)
	{
		WebDriver driver=setUp("https://www.istqb.org/");
		WebElement element=driver.findElement(By.linkText("Certification"));
		WebElement element1=driver.findElement(By.linkText("Expert Level"));
		
	
		Actions actions=new Actions(driver);
		//actions.moveToElement(element).click(element1).perform();
		actions.moveToElement(element).perform();
		actions.moveToElement(element1).perform();
		
		
		
								
		System.out.println(element1.getText());
	}

}
