package executionclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import pomclass.ActitimeLogin;


public class Testclass1 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	          System.out.println("BeforeMethod");
	}
	
	@Test(priority=2)
	public void btest() {
		
			System.out.println(" b test"); 
	}
	
	@Test(priority=3,invocationCount=2,dependsOnMethods= {"btest","dtest"})
	public void atest() {
		
			System.out.println(" a test"); 
	}
	
	@Test(priority=0,invocationCount=3,enabled=false)
	public void ctest() {
		
			System.out.println(" c test"); 
	}
	
	@Test(priority=-2,timeOut=3000)
	public void dtest() {
			System.out.println(" dtest"); 
	}
	
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("AfterMethod");
	}	
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
		
	
}
