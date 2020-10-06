package com.alphabet.gmail.handlingpopups;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class Assignment14_3AlternateChildBrowserTitles extends BasicSettings3
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.naukri.com/");
		
		String parentWid = driver.getWindowHandle();		
		
		
		Set<String> windowIds = driver.getWindowHandles();
		windowIds.remove(parentWid);
		
		for(String windowId:windowIds)
		{
			driver.switchTo().window(windowId);
			System.out.println(windowId);
			System.out.println(driver.getTitle());
			//driver.close();
		}
		
		
		
		Iterator <String> windowIterator=windowIds.iterator();
		
		while(windowIterator.hasNext())
		{
			try
			{
			
			driver.switchTo().window(windowIterator.next());
			System.out.println(driver.getTitle());
			driver.close();
			windowIterator.next();
			}
			catch(NoSuchElementException ne)
			{
				System.out.println("No More windows which has to be closed!!!! ");
			}
		}
	} 

}
