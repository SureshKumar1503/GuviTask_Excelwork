package Task_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Q1 {

	public static void main(String[] args) {
                  WebDriver driver = new FirefoxDriver() ;
                  driver.manage().window().maximize();
                 // driver.get("http://google.com");
                 
                  driver.navigate().to("http://google.com");
                 String url = driver.getCurrentUrl();
                 System.out.println(url);
                  
                  driver.navigate().refresh();
                  
                  driver.close();
	}

}
