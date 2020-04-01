package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterPinZerodha {

	@FindBy(xpath="//input[@type='password']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueto;
	@FindBy(xpath="//a[text()='Forgot 2FA?']") private WebElement forgot2FA;
	@FindBy(xpath="//a[contains(text(),'now!')]") private WebElement newsignup;
	
	
	public EnterPinZerodha(WebDriver driver) {        // costructor
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin()
	{
		pin.sendKeys("038631");
	}
	
	public void continueTo()
	{
		continueto.click();
	}
	
	public void forgotPin()
	{
		forgot2FA.click();
	}
	
	public void  newSignup()
	{
		newsignup.click();
	}
	
	
	
	
	
	
	
	
}
