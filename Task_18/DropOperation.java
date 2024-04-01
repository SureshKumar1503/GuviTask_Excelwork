package com.Task_18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropOperation {

	public static void main(String[] args) {
		

		
		        WebDriver driver = new ChromeDriver();
		        
		        driver.get("https://jqueryui.com/droppable/");
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		        
		        WebElement sourceElement = driver.findElement(By.id("draggable"));
		        WebElement targetElement = driver.findElement(By.id("droppable"));
		        
		        Actions actions = new Actions(driver);
		        
		        actions.dragAndDrop(sourceElement, targetElement).perform();
		         
		        
		        String droppedText = targetElement.getText();
		        System.out.println(droppedText);
		        
		        if(droppedText.equals("Dropped!")) {
		            System.out.println("Drag and Drop successful!");
		          
		            
		            driver.quit();
		    }
		}

	}


