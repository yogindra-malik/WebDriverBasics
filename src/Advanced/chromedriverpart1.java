package Advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriverpart1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Sanjana\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.wikipedia.org");

	}

}
