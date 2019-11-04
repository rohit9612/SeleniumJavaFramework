package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReporterDemo {
private static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extent.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test=extent.createTest("GoogleSearch1", "This is test to validate google search");
		WebDriverManager.chromedriver().version("75.0.3770.8").setup();
		driver=new ChromeDriver();
		test.log(Status.INFO, "startinh test");
		driver.get("https://www.google.com");
		test.pass("navigated to google");
		driver.findElement(By.name("q")).sendKeys("Sunny leone");
		test.pass("entered to google text box");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("press enter key");
		driver.close();
		test.pass("browser closed");
		System.out.println("Rohit u r genious");
		test.info("test completed");
		
		ExtentTest test2=extent.createTest("GoogleSearch test 2", "This is test to validate invalid google search");
				driver=new ChromeDriver();
		test2.log(Status.INFO, "startinh test");
		driver.get("https://www.google.com");
		test2.pass("navigated to google");
		driver.findElement(By.name("q")).sendKeys("Sunny leone");
		test2.pass("entered to google text box");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.fail("press enter key failed");
		driver.close();
		test2.pass("browser closed");
		System.out.println("Rohit u r genious");
		test2.info("test completed");
		extent.flush();

	}

}
