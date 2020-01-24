package testNGPakageDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	public WebDriver driver;
	
	@Test
	public void verifyLogin() throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		
		
		driver=new RemoteWebDriver(new URL("http://172.23.102.28:1234/wd/hub"),capabilities);
		
		driver.get("http://demowebshop.tricentis.com/login");
		String title=driver.getTitle();
		System.out.println(title);
		
		/*driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("gpravenya97@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Pravenya@123");
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();*/
	}
}
