package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLunitdriver {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver d = new HtmlUnitDriver();
        d.get("http://www.gmail.com");
        
    	d.findElement(By.xpath(".//*[@id='Email']")).sendKeys("yogindra.malik@gmail.com");
		d.findElement(By.xpath(".//*[@id='next']")).click();
		System.out.println("email entered");
		d.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("med,troublemaker");
		System.out.println("password entered");
		d.findElement(By.xpath(".//*[@id='signIn']")).sendKeys(Keys.ENTER);
		
       
	}

}
