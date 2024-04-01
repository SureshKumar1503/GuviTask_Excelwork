package com.guviTask19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviResister_task19 {

	public static void main(String[] args) {
             
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guvi.in/register/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	    driver.findElement(By.tagName("input")).sendKeys("suresh");
		
	    driver.findElement(By.id("email")).sendKeys("Sureshrainapmk@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9994864235s");
	    
	   driver.findElement(By.cssSelector("#mobileNumber")).sendKeys("8778119130");
		
	   
	    driver.findElement(By.linkText("Sign Up")).click();
	}

}
