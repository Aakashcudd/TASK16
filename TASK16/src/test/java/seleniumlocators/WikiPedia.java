package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WikiPedia {

	public static void main(String[] args) throws Exception {
		
		// Setup WebDriver
		WebDriverManager.chromedriver().setup();
		
		// Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();
		
		
			// Navigate to Website
			driver.navigate().to("https://www.wikipedia.org/");
			Thread.sleep(3000);
			
			// Maximizes the Browser
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			// Searches for the Query
			driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Intelligence");
			Thread.sleep(3000);
			
			// Click on Search
			driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
			Thread.sleep(3000);
			
			// Click on History
			driver.findElement(By.xpath("//a[normalize-space()='History of artificial intelligence']")).click();
			Thread.sleep(3000);
			
			// Print the title of the section
			System.out.println(driver.getTitle());
		
			// Close the browser
			driver.close();
				
}
}
