package Advanced;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriverpart2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Sanjana\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.bobibanking.com/");
               Set<String> winids = d.getWindowHandles();
              Iterator<String> itr = winids.iterator();
              String mainwindow = itr.next();
              d.findElement(By.xpath("//a[@href='PhisingguideC.htm']")).click();
             Thread.sleep(2000L);
              winids = d.getWindowHandles();
              itr = winids.iterator();
            String main = itr.next();
            String tab = itr.next();
             d.switchTo().window(tab);
             System.out.println(main);
             System.out.println(tab);
             d.findElement(By.xpath("//input[@id='txtCorpID']")).sendKeys("yogi");
             Thread.sleep(2000L);
             d.close();
             d.switchTo().window("main");
             d.close();
             
	}

}
