package com.alphabet.gmail.handlingframes;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class SendingAnEmail extends BasicSettings3
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.className("rd_write")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("nameishemanth@rediffmail.com");
		String subjectXpath = "//input[@class='rd_inp_sub rd_subject_datacmp2']";
		driver.findElement(By.xpath(subjectXpath)).sendKeys("Test Email On 07-sep-20");
		
		WebElement bFrame=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(bFrame);
		
		String bodyXpath ="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']";
		driver.findElement(By.xpath(bodyXpath)).sendKeys("We Are all from BTM Qspiders Branch2");
		
//		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Send")).click();
		
		
		driver.findElement(By.linkText("Sent")).click();
		System.out.println("Mail is Present in SentItems!!!!"+driver.findElement(By.xpath("//span[text()='Test Email On 07-sep-20']")).getText());
		
		
	
	}
}


