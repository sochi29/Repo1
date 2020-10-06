package com.alphabet.gmail.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyWhetherTextIsNormal extends BasicSettings3 {

	public static void main(String[] args) {
		
      WebDriver driver=setUp();
      String expectedFontWeight="400";
      String actualFontWeight=driver.findElement(By.id("headerContainer")).getCssValue("font-weight");
     if(expectedFontWeight.equals(actualFontWeight))
     {
    	 System.out.println("PASS!!!!Its Normal Text");
     }
     else
     {
    	 System.out.println("Fail!!!!Not a Normal Text"); 
     }
	}

}
