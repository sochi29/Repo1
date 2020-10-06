package com.alphabet.gmail.handlingframes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class Assignment11VerifyYoutubePageTitle extends BasicSettings3
{

	public static void main(String[] args)
	{
		WebDriver driver= setUp("https://www.google.com/");
		driver.findElement(By.xpath("//a[@class='gb_D gb_Ac']")).click();
		WebElement gframe=driver.findElement(By.xpath("//iframe[@role='presentation']"));
		
		driver.switchTo().frame(gframe);
		
		driver.findElement(By.xpath("//span[text()='YouTube']")).click();
		System.out.println("Title is:-"+driver.getTitle());
		
		

	}

}
