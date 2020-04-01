package utilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromedriver {
	
     public WebDriver chrome()	{
    	 ChromeOptions opt=new ChromeOptions();
    	 opt.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shashikant\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.navigate().to("https://kite.zerodha.com");
	return driver;
}
	
}
