package testNGPakageDemo;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void startApp(){
		System.out.println("start application");
	}
	
	@Test(dependsOnMethods="startApp")
	public void login(){
		System.out.println("login to application");
	}
	
	@Test(dependsOnMethods="login")
	public void logout(){
		System.out.println("logout of application");

}
}