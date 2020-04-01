package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardZerodha {

	@FindBy(xpath="//span[text()='HATSUN']") private WebElement hatsun;
	
	
	
	
	public DashboardZerodha(WebDriver driver) {        // costructor
		PageFactory.initElements(driver, this);
	}
	
	public void movetoHatsun(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(hatsun).perform();
	}
	
}
