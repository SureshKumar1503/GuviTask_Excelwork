package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoShop_Resister {

	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://demowebshop.tricentis.com/");
       driver.manage().window().maximize();
       driver.findElement(By.className("ico-register")).click();
      System.out.println(driver.getTitle());
       driver.findElement(By.id("gender-male")).click();
       driver.findElement(By.id("FirstName")).sendKeys("Suresh");
     WebElement ele= driver.findElement(By.id("LastName"));
    		 ele.sendKeys("Kumar");
    	boolean	element= ele.isDisplayed();
    	boolean element1=ele.isSelected();
    	System.out.println(element);
    	System.out.println(element1);
       driver.findElement(By.id("Email")).sendKeys("sureshrainapmk@gmail.com");
       driver.findElement(By.id("Password")).sendKeys("Sureshkumar123");
       driver.findElement(By.id("ConfirmPassword")).sendKeys("Sureshkumar123");
       driver.findElement(By.id("register-button")).click();
       driver.getTitle();
       
       
	}

}
