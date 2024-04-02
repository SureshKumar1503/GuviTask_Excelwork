package com.Task_22;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHP_Travels {
      int num1;
      int num2;
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		
		driver.findElement(By.name("first_name")).sendKeys("Suresh");
		driver.findElement(By.name("last_name")).sendKeys("kumar");
		
		driver.findElement(By.name("business_name")).sendKeys("Guvi");
		driver.findElement(By.name("email")).sendKeys("suresh@gmail.com");
		
		
		String numb1=driver.findElement(By.xpath("//span[@id='numb1']")).getText();
        String numb2= driver.findElement(By.xpath("//span[@id='numb2']")).getText();
        
        int Number1=   Integer.parseInt(numb1);
        int Number2= Integer.parseInt(numb2);
		
	    int	Number3= Number1+Number2;
	        String sum1=String.valueOf(Number3);
	    driver.findElement(By.id("number")).sendKeys(sum1);
	    
	  
	    
	    WebElement login=driver.findElement(By.id("demo"));
	   System.out.println(login.getText());
	   String n1= login.getText();
	   takeScreenshot(sum1, driver);
	    login.click();
	    
	    
	    if(n1.equals("Submit")){
	    	System.out.println("Successfully submited Thank you");
	    }else {
	    	System.out.println("Not Submited");
	    }
	}
	    public static String takeScreenshot(String testName,WebDriver driver) throws IOException {
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File SourceFile=screenshot.getScreenshotAs(OutputType.FILE);
			 File DestinationFile= new File("C:\\Users\\sures\\eclipse-workspace\\Idc_BBP\\src\\main\\java\\Screenshots\\sample.png");
			 org.openqa.selenium.io.FileHandler.copy(SourceFile,DestinationFile);
			return testName;

}}
