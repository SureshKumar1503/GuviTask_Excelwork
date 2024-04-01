package com.Task_21;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDirection {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(60);
		System.out.println(driver.getTitle());
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		String left = "LEFT";
		String leftvalue = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		if (left.equals(leftvalue)) {
			System.out.println("Control inside the left frame");
		}else {
			System.out.println("Control outside the left frame");
		}
		
		Thread.sleep(20);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top");
		//*****************************************************
		
		driver.switchTo().frame("frame-middle");
		String mid = "MIDDLE";
		String midvalue = driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText();
		if (mid.equals(midvalue)) {
			System.out.println("Control inside the MIDDLE frame");
		}else {
			System.out.println("Control outside the MIDDLE frame");
		}

		driver.switchTo().defaultContent();
      driver.switchTo().frame("frame-top");
      driver.switchTo().frame("frame-right");
      
      String right= "RIGHT";
      String rightvalue=driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
      if(right.equals(rightvalue)) {
    	  System.out.println("Control inside the Right frame");
      }
      else {
    	  System.out.println("Control Outside the Right frame");
      }
      driver.switchTo().defaultContent();
          
      driver.switchTo().frame("frame-bottom");
      
      String bottom= "BOTTOM";
      String bottomvalue=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
      if(bottom.equals(bottomvalue)) {
    	  System.out.println("Control inside the Bottom frame");
      }
      else {
    	  System.out.println("Control Outside the BottomValue frame");
      }
      driver.switchTo().defaultContent();
    WebDriver sr=  driver.switchTo().frame("frame-top");
      
      
      System.out.println(sr.getTitle());
	}

}