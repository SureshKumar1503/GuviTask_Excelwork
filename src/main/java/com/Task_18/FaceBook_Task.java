package com.Task_18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_Task {

	public static void main(String[] args) {
           
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("User");
		driver.findElement(By.name("reg_email__")).sendKeys("Testuser@test.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Testuser@test.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("suresh12345");
		
        WebElement sel =driver.findElement(By.name("birthday_day"));
        WebElement sel1 =driver.findElement(By.name("birthday_month"));
        WebElement sel2 =driver.findElement(By.name("birthday_year"));
		
	     Select select = new Select(sel);
	     Select select1 = new Select(sel1);
	     Select select2 = new Select(sel2);
	     select.selectByIndex(10);
	     select1.selectByIndex(4);
	     select2.selectByVisibleText("1985");
	     
   	    driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
        WebElement Fb_Home =	driver.findElement(By.name("websubmit"));
        Fb_Home.click();
        
        System.out.println( "successfully logIn " +Fb_Home);
    	
	}

}
