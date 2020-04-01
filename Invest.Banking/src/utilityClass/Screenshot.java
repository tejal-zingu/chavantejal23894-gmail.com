package utilityClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public void ss(String s, WebDriver driver) throws IOException
	{
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
	File dest=new File("C:\\Users\\shashikant\\Tejal software setup file\\Screenshot Selenium\\Zerodha Project\\" +s+ " " +datetime()+".jpg");
	FileUtils.copyFile(source, dest);
	}
	public static String datetime()
	{
		String date =  new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		return date;
	}
	
	
	
	
	
}
