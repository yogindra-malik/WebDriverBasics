package calenders;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calender1 {

	public static int targetday=0,targetmonth =0,targetyear =0;
	public static int currentday=0,currentmonth =0,currentyear =0;
	public static String targetdate = "15/9/2016";
	public static int monthstojump;
	public static boolean increment = true;
	
	public static void getcurrentdate()
	{
		Calendar c = Calendar.getInstance();
		currentday = c.get(Calendar.DAY_OF_MONTH);
		currentmonth = c.get(Calendar.MONTH )+1;
		currentyear = c.get(Calendar.YEAR);
		System.out.println(currentday +" " +currentmonth +" " +currentyear);
	}
	
	public static void gettargetdate(String currentdate)
	{
		int startindex = currentdate.indexOf('/');
		int endindex = currentdate.lastIndexOf('/');
		 targetday= Integer.parseInt(currentdate.substring(0,startindex));
		 targetmonth= Integer.parseInt(currentdate.substring(startindex+1,endindex));
		 targetyear= Integer.parseInt(currentdate.substring(endindex+1,currentdate.length()));
		System.out.println(targetday +" " +targetmonth +" " +targetyear);
		
	}
	
	public static void howmanymonthstojump()
	{
		if(targetmonth - currentmonth > 0)
		{
		 monthstojump = targetmonth - currentmonth;
			
		}
		else{
			
			 monthstojump  = currentmonth - targetmonth;
			 increment = false;
		}
		
		System.out.println(monthstojump);
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		//should know before hand
		//target day,month,year
		//current day,month,year
		//jump to the month
		//increment or decrement
		//
		
		gettargetdate(targetdate);
		 getcurrentdate();
		 howmanymonthstojump();
		 WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		 d.get("https://jqueryui.com/datepicker/");
		 System.out.println((d.findElements(By.tagName("iframe")).size()));
			d.switchTo().frame(d.findElements(By.tagName("iframe")).get(0));
			
		 d.findElement(By.xpath(".//*[@id='datepicker']")).click();
		// Thread.sleep(1000L);
		 
		 
		 WebElement left= d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]"));//left
		 WebElement right= d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]"));//right
		 
		 for (int i=0;i<monthstojump;i++)
		 {
			 if(increment == true)
			 {
				 left.click();
			 }
			 else
			 {
				 right.click();
			 }
			 Thread.sleep(1000L);
			 
			 
		 }
		 d.findElement(By.linkText(Integer.toString(targetday))).click();
		 Thread.sleep(1000L);

	}

}
