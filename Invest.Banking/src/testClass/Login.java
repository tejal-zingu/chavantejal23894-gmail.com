package testClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClass.DashboardZerodha;
import pomClass.EnterPinZerodha;
import pomClass.LoginPageZerodha;
import utilityClass.Chromedriver;
import utilityClass.Screenshot;

public class Login {
	WebDriver driver;
	@BeforeClass
	public void beforeclass() throws InterruptedException
	{
		Chromedriver cd=new Chromedriver();
	driver=cd.chrome();
	Thread.sleep(2000);
	}
	
	@BeforeMethod
	public void beforemethod() throws IOException
	{
		Screenshot s=new Screenshot();
		s.ss("Zerodhaloginpageopen", driver);
		System.out.println("screenshot of login page taken");
	}
	
	@Test(priority=1)
	public void test1() throws InterruptedException
	{
		LoginPageZerodha log=new LoginPageZerodha(driver);
		log.sendUId();
		log.sendPwd();
		log.clickLogin();
		Thread.sleep(2000);
		EnterPinZerodha en=new EnterPinZerodha(driver);
		en.enterPin();
		en.continueTo();
		Thread.sleep(3000);
		DashboardZerodha ds=new DashboardZerodha(driver);
		ds.movetoHatsun(driver);
	}
	@AfterMethod
	public void aftermethod() throws IOException, InterruptedException
	{
		Screenshot s=new Screenshot();
		s.ss("login successfull", driver);
		System.out.println("screenshot of home  page taken");
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
	
	
	
	
	
	
	
}
