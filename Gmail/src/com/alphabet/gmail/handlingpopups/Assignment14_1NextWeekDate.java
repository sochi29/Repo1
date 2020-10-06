package com.alphabet.gmail.handlingpopups;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class Assignment14_1NextWeekDate extends BasicSettings3
{

	public static void main(String[] args)
	{
		LocalDateTime ldt=LocalDateTime.now().plusDays(7);
		int day=ldt.getDayOfMonth();
		
		
		String month=ldt.getMonth().name();
		month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
		
		int year=ldt.getYear();
		
		WebDriver driver = setUp("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//span[.='"+month+"']/../../..//a[.='"+day+"']")).click();
	
		
		
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		

	}

}
