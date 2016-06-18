package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.server.DriverProvider;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.mysql.jdbc.Driver;

public class testsciptforeventlisteners {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new FirefoxDriver();
        
        
        EventFiringWebDriver evDriver =new EventFiringWebDriver(d);
        eventlistenerseventfiringmouseandcoordinates evlistener = new eventlistenerseventfiringmouseandcoordinates();
        evDriver.register(evlistener);
        d.get("http://www.gmail.com");
    	d.findElement(By.xpath(".//*[@id='Email']")).sendKeys("yogindra.malik@gmail.com");
		d.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(1000L);
		d.findElement(By.xpath(".//*[@id='signIn']")).click();
		Thread.sleep(1000L);
	}

}
