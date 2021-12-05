package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverMac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.gecko.driver","/Users/curtisstilwell/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "https://learn.letskodeit.com/";
		driver.get(baseURL);
	}

}
