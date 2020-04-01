package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageZerodha {

	@FindBy(xpath="//input[@type='text']") private WebElement userID;
	@FindBy(xpath="//input[@type='password']") private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	@FindBy(xpath="//a[text()='Forgot password?']") private WebElement forgotpwd;
	@FindBy(xpath="//a[contains(text(),'now!')]") private WebElement newsignup;
	
	
	public LoginPageZerodha(WebDriver driver) {        // costructor
		PageFactory.initElements(driver, this);
	}
	
	public void sendUId() 
	{
		userID.sendKeys("DV1510");
	}
	
	public void sendPwd() 
	{
		pwd.sendKeys("vijay123");
	}
	
	public void  clickLogin()
	{
		login.click();
	}
	
	public void  forgotPwd()
	{
		forgotpwd.click();
	}
	
	public void  newSignup()
	{
		newsignup.click();
	}
	
	
	
	
	
	
}
