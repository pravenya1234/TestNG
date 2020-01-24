package ParallelTestingDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestingTest {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("wedriver.gecko.driver","D:\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else{
			throw new Exception("browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void login() throws InterruptedException
	{
		 driver.navigate().to("http://demowebshop.tricentis.com/login");
		 driver.findElement(By.id("Email")).sendKeys("gpravenya97@gmail.com");
		 driver.findElement(By.name("Password")).sendKeys("Pravenya@123");
		 driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		 Thread.sleep(3000);

	}
	@AfterTest
	public void endTest(){
		driver.quit();
	}
	
}
