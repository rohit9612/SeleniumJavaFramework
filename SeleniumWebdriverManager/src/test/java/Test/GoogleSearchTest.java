package Test;

import pages.GoogleSearchpage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException  {
		googleSearch();
			
		}
	public static void googleSearch() throws InterruptedException  {
		WebDriverManager.chromedriver().version("75.0.3770.8").setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		 GoogleSearchpage.searchBox(driver).sendKeys("Sunny leone");
		 Thread.sleep(2000);
		 GoogleSearchpage.searchButton(driver).sendKeys(Keys.RETURN);
		 System.out.println("Rohit u r genious");
		 driver.close();
		 
	}

}
