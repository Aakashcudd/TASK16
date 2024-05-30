package seleniumlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlaze {
	public static void main(String[] args) throws Exception {

		// Setup WebDriver
        WebDriverManager.chromedriver().setup();

    	// Launching Chrome Browser Instance
        WebDriver driver = new ChromeDriver();
             
        try {
             // Navigate to the website
        	 driver.navigate().to("https://www.demoblaze.com");
             Thread.sleep(3000);

            // Maximize the browser window
            driver.manage().window().maximize();
            Thread.sleep(3000);

            // Get the title of the page
            String pageTitle = driver.getTitle();

            // Verify the title of the page
            if ("STORE".equals(pageTitle)) {
                System.out.println("Page landed on correct website");
            } else {
                System.out.println("Page not landed on correct website");
            }
        } finally {
            // Close the browser
            driver.close();

	}
 }

}
