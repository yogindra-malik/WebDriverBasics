package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class Eventfiringmouse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		EventFiringWebDriver evDriver =new EventFiringWebDriver(d);
        eventlistenerseventfiringmouseandcoordinates evlistener = new eventlistenerseventfiringmouseandcoordinates();
        evDriver.register(evlistener);
        
		
		EventFiringMouse efm = new EventFiringMouse(evDriver,evlistener);
		
		d.get("http://www.google.com");
        Thread.sleep(1000L);
		Locatable hoveritem =(Locatable) evDriver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a"));
        Coordinates c = hoveritem.getCoordinates();
        efm.mouseMove(c);
	}

}
