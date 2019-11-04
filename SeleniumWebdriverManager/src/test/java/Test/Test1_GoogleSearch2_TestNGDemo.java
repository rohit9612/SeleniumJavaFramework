package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch2_TestNGDemo {
	static WebDriver driver=null;

	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().version("75.0.3770.8").setup();
		driver=new ChromeDriver();
	}		

	@Test
	public static void googleSearch() throws InterruptedException   {

		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Sunny leone");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);


	}
	@AfterTest
	public void closeTest() {

		driver.close();
		System.out.println("Rohit u r genious");
	}

}
