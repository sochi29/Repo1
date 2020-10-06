package com.alphabet.gmail.handlingpopups;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class Assignment14_2CurrentDateInCalendarPopup extends BasicSettings3
{

	public static void main(String[] args)
	{
	    
		LocalDateTime ldt= LocalDateTime.now();
		int day=ldt.getDayOfMonth();
		String month=ldt.getMonth().name();
		int year=ldt.getYear();
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
		
		WebDriver driver=setUp("https://www.cleartrip.com/");
		WebElement element=driver.findElement(By.id("DepartDate"));
			element	.click();
			element.sendKeys(day+month+year);
		//driver.findElement(By.xpath("//span[.='"+month+"']/../../..//a[.='"+day+"']")).click();

	}

}
