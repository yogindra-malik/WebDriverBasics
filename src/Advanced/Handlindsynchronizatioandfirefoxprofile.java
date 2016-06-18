package Advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Handlindsynchronizatioandfirefoxprofile {

	public static void main(String[] args) {
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile profile = profiles.getProfile("selenium");
		FirefoxProfile profile1 = profiles.getProfile("default");
		WebDriver d = new FirefoxDriver(profile);
		WebDriver d1 = new FirefoxDriver(profile1);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //global wait - will wait for maximum 10 seconds before every thing
		d.get("http://gmail.com");
		d1.get("http://google.com");
		
		
		

	}

}
