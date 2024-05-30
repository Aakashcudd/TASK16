package seleniumlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox {

	public static void main(String[] args) throws Exception {
		
		// Setup WebDriver
		WebDriverManager.firefoxdriver().setup();
		
		// Launching Firefox Browser Instance
	    WebDriver driver = new FirefoxDriver();

	      try {
	      // Maximize the Browser Window
	      driver.manage().window().maximize();

	      // Navigate to google
	      driver.navigate().to("http://google.com");
          Thread.sleep(3000);
	      
	      // Print the URL of the current page
	      System.out.println("current URL:"+ driver.getCurrentUrl());
	     	      	      
	      // To check the Login of a website:
	     // driver.navigate().to("https://www.facebook.com/login/");
	      
	      // Refresh the page
	      driver.navigate().refresh();
	      } finally {
	    	  // Close the browser
	    	  driver.quit();
	      }

	}

}
