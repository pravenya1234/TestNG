package testNGPakageDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunDemo {
WebDriver driver;
	@Test
	public void startApp(){
	System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.navigate().to("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	System.out.println("start application");
	
}
	@Test(dependsOnMethods="startApp")
	public void checktitle(){
		driver.findElement(By.id("Email")).sendKeys("gpravenya97@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Pravenya@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String expectedname="Demowebstore";
		String  actualname=driver.getTitle();
		System.out.println(actualname);
		Assert.assertEquals( expectedname,actualname);
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("log offf the application");  
	}
	@Test(dependsOnMethods="checktitle",alwaysRun=true)
	public void logoff(){
		driver.close();
	}
}
