package Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingwebtables {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		List<WebElement> l;
		int rownumber =0;
		int colnumber =0;
        d.get("http://www.espncricinfo.com/england-v-sri-lanka-2016/engine/match/913617.html");
        String row = ".//*[@id='summary']/div[3]/div/table[2]/tr[2]/td[1]/table/tbody/tr[" +""+  "]/td[2]";
        String coloumn = ".//*[@id='summary']/div[3]/div/table[2]/tr[2]/td[1]/table/tbody/tr[1]/td["+""+"]";
        
         for(int i=1;i<3;i++)
        {
        	 WebElement v= d.findElement(By.xpath(".//*[@id='summary']/div[3]/div/table[2]/tr[2]/td[1]/table/tbody/tr[" +i+  "]/td[2]"));
        	   System.out.println(v.getText());
        	 rownumber++;	
        
         for(int j=1;j<9;j++)
         {
         	 WebElement v1= d.findElement(By.xpath(".//*[@id='summary']/div[3]/div/table[2]/tr[2]/td[1]/table/tbody/tr["+i+"]/td["+j+"]"));
         	     System.out.println(v1.getText());
         	 colnumber++;	
         }
       }
	}

}
