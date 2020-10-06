package com.alphabet.gmail.handlingframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.javascriptcode.BasicSettings3;;

public class SelectingDOBInFacebookSignUp extends BasicSettings3
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		
		WebElement dayListBox=driver.findElement(By.id("day"));
		WebElement monthListBox=driver.findElement(By.id("month"));
		WebElement yearListBox=driver.findElement(By.id("year"));
		
		
		Select s=new Select(dayListBox);
		Select s1 = new Select(monthListBox);
		Select s2=new Select(yearListBox);
		
		s.selectByVisibleText("12");
		s1.selectByVisibleText("Nov");
		s2.selectByVisibleText("1984");
		
		String day=s.getFirstSelectedOption().getText();
		String month=s1.getFirstSelectedOption().getText();
		String year=s2.getFirstSelectedOption().getText();
		
		System.out.println("Dob:-"+day+"-"+month+"-"+year);
		driver.close();
	}
}
