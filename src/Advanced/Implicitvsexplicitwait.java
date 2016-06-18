package Advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class Implicitvsexplicitwait {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://www.google.com");
	//implicit
		d.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(10L, TimeUnit.SECONDS);
		d.manage().timeouts().setScriptTimeout(10L, TimeUnit.SECONDS);
		
		//explicit
		WebDriverWait wait = new WebDriverWait(d,10L);
		WebElement el = d.findElement(By.name("name"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
		
	//	Wait<WebDriver> wait1 = new FluentWait<WebDriver>(d).withTimeout(10L,TimeUnit.SECONDS).pollingEvery(10L, TimeUnit.SECONDS).withMessage("error coured in fluent wait");
		

	}

}
