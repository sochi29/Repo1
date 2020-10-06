package com.alphabet.gmail.testscript;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveTheWindow extends BasicSettings {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		Dimension dim2 = new Dimension(300, 400);
		driver.manage().window().setSize(dim2);
		
		
		Point pt=driver.manage().window().getPosition();
		int height=dim2.getHeight();
		int width=dim2.getWidth();
		System.out.println("height="+height);
		System.out.println("width="+width);
		int startX=pt.getX();
		int startY=pt.getY();
		System.out.println("X="+startX);
		System.out.println("Y="+startY);
		
		
		Point pt2=new Point(100, 500);
		driver.manage().window().setPosition(pt2);
	}
}
