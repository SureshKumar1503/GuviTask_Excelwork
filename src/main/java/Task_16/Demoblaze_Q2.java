package Task_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Demoblaze_Q2 {

	public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.demoblaze.com/");
         driver.manage().window().maximize();
         
         String expectedTitle = "STORE";
       
         System.out.println("Expected Title is "+expectedTitle);
        
         String  actualTitile = driver.getTitle();
         
         System.out.println("ActualTitile is "+actualTitile);
         
         if (expectedTitle.equalsIgnoreCase(actualTitile)) {
        	
        	 System.out.println("Page landed on correct website");
        	 
         }else {
        	 System.out.println("Page not landed on correct website");
         }
	      
	}
          
}
