package Advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingjquery {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
//		d.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
	//	d.get("http://jqueryui.com/droppable/");    	
//		WebElement from=	d.findElement(By.xpath(".//*[@id='draggable']"));
//	
//	WebElement to =	    d.findElement(By.xpath(".//*[@id='droppable']"));
//	Actions a  = new Actions(d);
//	
//	a.dragAndDrop(from, to);  

//				d.get("http://jqueryui.com/resizable/"); 
//				System.out.println((d.findElements(By.tagName("iframe")).size()));
//				d.switchTo().frame(d.findElements(By.tagName("iframe")).get(0));
//		WebElement resize =	d.findElement(By.xpath(".//*[@id='resizable']"));
//         	
//
//	Actions a1  = new Actions(d);
//	
//	a1.dragAndDropBy(resize, 400, 500);  
		
		d.get("http://jqueryui.com/slider/"); 
		System.out.println((d.findElements(By.tagName("iframe")).size()));
		d.switchTo().frame(d.findElements(By.tagName("iframe")).get(0));
WebElement slider =	d.findElement(By.xpath(".//*[@id='slider']/span"));
 Thread.sleep(1000L);	

Actions a1  = new Actions(d);

a1.dragAndDropBy(slider, 20, 0);  
	
	
	
    
     	
	
	}

}
