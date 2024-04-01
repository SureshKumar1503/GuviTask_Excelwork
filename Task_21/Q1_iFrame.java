package com.Task_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_iFrame {

	public static void main(String[] args) {
        
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
	
	
		driver.findElement(By.xpath("//div[text()='p']")).click();
		
		
		driver.switchTo().frame(0);
		
		String titlt = driver.getTitle();
	
		
		driver.findElement(By.id("tinymce")).sendKeys("Hello people");
		System.out.println(titlt);
        driver.close();
		
	}
}

