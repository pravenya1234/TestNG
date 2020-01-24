package testNGPakageDemo;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test
	public void startApp(){
		System.out.println("start application");
	}
	
	@Test(priority=1)
	public void login(){
		System.out.println("login to application");
	}
	
	@Test(priority=2)
	public void logout(){
		System.out.println("logout of application");
	}
}
