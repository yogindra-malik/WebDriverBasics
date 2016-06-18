import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Htmlradiobuttonandcheckboxes {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
      //  d.get("http://www.quackit.com/html/codes/html_radio_button.cfm");
       d.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en");
		WebElement el = d.findElement(By.id("SkipCaptcha"));
		WebElement el1 = d.findElement(By.name("TermsOfService"));
		el.click();
		el1.click();
       System.out.println(el.getAttribute("value"));
      // List<WebElement> l = el.findElements(By.tagName("input"));
       //for(WebElement w1 : l)
 		//{
 		//	System.out.println(w1.getAttribute("value"));
 		//}
	}

}
