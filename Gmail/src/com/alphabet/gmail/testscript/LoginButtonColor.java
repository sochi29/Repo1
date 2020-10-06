package com.alphabet.gmail.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginButtonColor extends BasicSettings3 {

	public static void main(String[] args) {
		WebDriver driver=setUp();
		String expectedColor="rgba(22, 108, 188, 1)";
		String actualColor=driver.findElement(By.id("loginButton")).getCssValue("color");
		System.out.println(actualColor);
		if(actualColor.equals(expectedColor))
		{
			System.out.println("Pass!!!");
		}
		else
		{
			System.out.println("Fail!!!");
		}

	}

}
