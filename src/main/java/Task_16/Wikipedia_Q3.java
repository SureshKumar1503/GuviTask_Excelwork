package Task_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia_Q3 {

	public static void main(String[] args) {
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial intelligence");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.linkText("History")).click();
		String Title = driver.findElement(By.id("History")).getText();
		System.out.println(Title);
		
		driver.close();
		
	}

}
