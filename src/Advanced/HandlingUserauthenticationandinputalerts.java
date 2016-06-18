package Advanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingUserauthenticationandinputalerts {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
//		d.get("http://yogindra.malik:med,hfidhfidr@way2sms.com");  
		// handling user authentication

		d.get("http://www.tutorialspoint.com/javascript/src/prompt_dialog_box.htm");
		d.findElement(By.xpath("html/body/form/input")).click();
		Alert a = d.switchTo().alert();
		a.sendKeys("yogi");
		//a.accept();
		a.dismiss();
	}

}
