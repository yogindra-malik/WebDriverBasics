package Advanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingJavascriptAlertKeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("http://gmail.com");
		d.findElement(By.xpath(".//*[@id='Email']")).sendKeys("yogindra.malik@gmail.com");
		d.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(2000L);
		d.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("med,troublemaker");
		d.findElement(By.xpath(".//*[@id='signIn']")).sendKeys(Keys.ENTER);
		Thread.sleep(20000L);
		 if(d.findElement(By.xpath(".//*[@id='gbq1']/div/a/span")).isDisplayed() == true)
		{
			d.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
			
            d.findElement(By.linkText("Sign out")).click();
	    }
		 //successful log out
		 
		
		//handling javascript alert
		 d.get("http://164.100.181.132/citizen/SignUp.aspx?Mode=Q3JlYXRl");
		 d.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		 Alert a = d.switchTo().alert();
		 a.dismiss();
		 Thread.sleep(10000L);
		 d.get("http://164.100.181.132/citizen/SignUp.aspx?Mode=Q3JlYXRl");
		 d.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		 Alert a1 = d.switchTo().alert();
		 a1.accept();
		 
		 
		 
		 
		 
		}

}
