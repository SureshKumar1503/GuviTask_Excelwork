package com.selenium;

import java.awt.RenderingHints.Key;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch_Q2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
       driver.findElement(By.id("APjFqb")).sendKeys("Selenium browser driver",Keys.ENTER);
      
		
	}

}
