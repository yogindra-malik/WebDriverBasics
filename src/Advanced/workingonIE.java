package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class workingonIE {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "C:\\Sanjana\\drivers\\IEDriverServer.exe");
		WebDriver d = new InternetExplorerDriver();
		d.get("http://jqueryui.com/slider/"); 
		System.out.println((d.findElements(By.tagName("iframe")).size()));
		d.switchTo().frame(d.findElements(By.tagName("iframe")).get(0));
WebElement slider =	d.findElement(By.xpath(".//*[@id='slider']/span"));
 Thread.sleep(1000L);	

Actions a1  = new Actions(d);

a1.dragAndDropBy(slider, 20, 0);  

	}

}
