package com.Task_21;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(10);
		String expectedText = "New Window";
		Thread.sleep(10);
		
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		String actualText = driver.findElement(By.xpath("//div[@class='example']")).getText();
		if(expectedText.equals(actualText)) {
			System.out.println("New window opened");
		}else {
			System.out.println("New window not opened");
		}

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}
		}
		driver.quit();
		}
	}