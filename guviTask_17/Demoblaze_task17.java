package com.guviTask_17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze_task17 {

	public static void main(String[] args) throws InterruptedException {
         
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Laptops")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sony vaio i5")).click();
		
		driver.close();
	}

}
