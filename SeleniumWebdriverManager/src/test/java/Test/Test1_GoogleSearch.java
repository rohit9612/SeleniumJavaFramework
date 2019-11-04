package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {

	public static void main(String[] args) throws InterruptedException  {
		googleSearch();
			
		}
	public static void googleSearch() throws InterruptedException  {
		WebDriverManager.chromedriver().version("75.0.3770.8").setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("Sunny leone");
		 Thread.sleep(1000);
		 driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		 System.out.println("Rohit u r genious");
		 driver.close();
		 
	}

}
