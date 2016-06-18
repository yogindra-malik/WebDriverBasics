package Advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class eventlistenerseventfiringmouseandcoordinates extends AbstractWebDriverEventListener {

	public void afterClickOn(WebElement element, WebDriver driver)
	{
		System.out.println("afterClickOn");
		
	}
	
	public void afterNavigateBack(WebDriver driver)
	{
		
		System.out.println("afterNavigateBack");
	}
}
