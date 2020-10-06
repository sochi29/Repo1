package com.alphabet.gmail.handlingpopups;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class DownloadSecurityMessageInChrome extends BasicSettings3
{
	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver = setUp("https://www.selenium.dev/downloads/");
		driver.findElement(By.linkText("3.141.59")).click();
		mySleepInSeconds(5);
		Robot robot = new Robot();
		robot.mouseMove(350, 835);
		System.out.println("Mouse Hovering done");
		//robot.mousePress(InputEvent.BUTTON1_MASK);
		//robot.mouseRelease(InputEvent.BUTTON1_MASK);
		//driver.close();
	}
}
