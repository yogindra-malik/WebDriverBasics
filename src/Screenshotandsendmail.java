import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshotandsendmail {

	public static void main(String[] args) throws IOException {
		WebDriver d = new FirefoxDriver();
        d.get("http://www.gmail.com");
        File scrfile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		           FileUtils.copyFile(scrfile, new File("C:\\Users\\yogindra\\Desktop\\Code\\gmailcapture.jpg")); 
       
	 //capture on error
	 try{
        	
        	d.findElement(By.id("hello"));
        }
		catch(Throwable t){
			
			 File scrfileerror = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	          FileUtils.copyFile(scrfileerror, new File("C:\\Users\\yogindra\\Desktop\\Code\\gmailerrorcapture.jpg")); 

		}
}
	}


