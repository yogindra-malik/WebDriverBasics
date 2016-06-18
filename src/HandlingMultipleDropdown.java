import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleDropdown {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
        d.get("https://www.wikipedia.org/");
        //multiple links
        WebElement drp =d.findElement(By.xpath(".//*[@id='www-wikipedia-org']/div[4]/div[2]"));
		List<WebElement> s=drp.findElements(By.tagName("a"));
		for(WebElement w : s)
		{
			System.out.println(w.getText());
		}
		
		// to print contents of dropdown
		 WebElement drop =d.findElement(By.xpath(".//*[@id='searchLanguage']"));
		  List<WebElement> drp2 =drop.findElements(By.tagName("option"));
          
          //List<WebElement> s1=  select.getOptions();
          for(WebElement w1 : drp2)
  		{
  			System.out.println(w1.getText());
  		}
          
		//all items in dropdown using options
          WebElement drop2 =d.findElement(By.xpath(".//*[@id='searchLanguage']"));
		Select sel = new Select(drop2);
		List<WebElement> drp3 = sel.getOptions();
		  for(WebElement w2 : drp3)
	  		{
	  			System.out.println(w2.getText());
	  		}
	}

}
