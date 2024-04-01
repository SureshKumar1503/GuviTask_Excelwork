package com.selenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SimpleWebDriverScript_Q5 {

	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        ChromeDriver driver = new ChromeDriver();


	        try {
	            // Navigate to the Google homepage
	            driver.get("https://www.google.com");

	            // Find the search box element by name
	            WebElement searchBox = driver.findElement(By.name("q"));

	            // Type a search query
	            searchBox.sendKeys("Selenium WebDriver");

	            // Submit the search form
	            searchBox.submit();

	            // Find and print the search result count
	            WebElement resultStats = driver.findElement(By.id("result-stats"));
	            System.out.println("Search Result Count: " + resultStats.getText());
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}

