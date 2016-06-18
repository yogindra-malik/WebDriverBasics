import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdown {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
            d.get("https://www.wikipedia.org/");
            
            WebElement drp =d.findElement(By.xpath(".//*[@id='searchLanguage']"));
            Select select = new Select(drp);
            select.selectByValue("et");
	}

}
