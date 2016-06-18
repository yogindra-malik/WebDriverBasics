import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMultipleTabsandWindows {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver w = new FirefoxDriver();
	    w.get("http://www.icicibank.com/");
	      w.manage().window().maximize();
          Set<String> winids = w.getWindowHandles();
          
          Iterator<String> itr =  winids.iterator();
          System.out.println(itr.next());
         
          WebElement element = w.findElement(By.xpath("html/body/div[1]/footer/div/a[1]"));
  		 Actions a = new Actions(w);
          a.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(element).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
  	
          System.out.println("-------After the new tab is opened--------");

          winids = w.getWindowHandles();
          itr =  winids.iterator();
          while(itr.hasNext())
          {
         String mainwindow = itr.next();
         System.out.println("-------After the new tab is open--------");
         String tabwindow = itr.next();
         System.out.println("-------After the second tab is open--------");
          
         System.out.println(mainwindow);
         System.out.println(tabwindow);
       //  w.switchTo().window(tabwindow);
          } 
        /* w.findElement(By.xpath(".//*[@id='main']/div[1]")).click();
         w.findElement(By.xpath(".//*[@id='expand-all-overview']")).click();
         Thread.sleep(1000L);
         w.findElement(By.xpath(".//*[@id='expand-all0']/div[1]/div/div/p[1]/a[2]")).click();
         winids = w.getWindowHandles();
         itr =  winids.iterator();
         String tabwindow = itr.next();
         
        */
         //System.out.println(itr.next());
//         driver.close(); // latest window pop up
// 		driver.switchTo().window(tabwindow);
// 		driver.close();
// 		driver.switchTo().window(firstwindow);
// 		driver.close();
         
	}

}
