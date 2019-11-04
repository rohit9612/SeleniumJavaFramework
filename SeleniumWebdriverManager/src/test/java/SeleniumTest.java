

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().version("75.0.3770.8").setup();
		WebDriver driver=new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver1.get("https://www.google.com");
		Thread.sleep(2000);
		driver.close();
		driver1.close();
	}

	}

