package com.alphabet.gmail.handlingpopups;


import java.util.Set;
import org.openqa.selenium.WebDriver;
import com.alphabet.gmail.javascriptcode.BasicSettings3;
public class CloseOnlyChildWindows extends BasicSettings3
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
			System.out.println(driver.getTitle());
			driver.close();
		}
	}
}

