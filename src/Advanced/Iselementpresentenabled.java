package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iselementpresentenabled {
	public static WebDriver d;  
	//= new FirefoxDriver();
	
	public static boolean iselelementpresent(String locator)
	{
		try{
			
			d.findElement(By.xpath(locator));
			return true;
		}
		catch(Throwable t)
		{
			return false;
			
		}
		
	}

	public static void main(String[] args) {
		d = new FirefoxDriver(); 
		d.get("http://www.w3schools.com/Html/tryit.asp?filename=tryhtml_checkbox");
		System.out.println((d.findElements(By.tagName("iframe")).size()));
        d.switchTo().frame(d.findElements(By.tagName("iframe")).get(2));
        d.findElement(By.xpath("html/body/form/input[1]")).click();
        d.findElement(By.xpath("html/body/form/input[1]")).isDisplayed();
        d.findElement(By.xpath("html/body/form/input[1]")).isEnabled();
        d.findElement(By.xpath("html/body/form/input[1]")).isSelected();
	}

}
