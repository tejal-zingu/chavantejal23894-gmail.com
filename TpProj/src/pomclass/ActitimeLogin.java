package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogin {

	@FindBy (xpath="//input[@id='username']") private WebElement username;
	@FindBy (xpath="//input[@name='pwd']") private WebElement password;
	@FindBy(xpath="//a[@id='loginButton']") private WebElement login;
	@FindBy(xpath="(//div[@class='label'])[2]") private WebElement task;
	@FindBy (xpath="//a[@id='logoutLink']") private WebElement logout;
	public ActitimeLogin(WebDriver driver) {
		   PageFactory.initElements(driver,this); 
	}
	
	public void giveusername() {
		username.sendKeys("admin");
	}
	
	public void pwd() {
		password.sendKeys("manager");
	}
	
	public void login() {
		login.click();
	}
	public void task(){
		task.click();
	}
	public void logout() {
		logout.click();
	}
	
	
}
