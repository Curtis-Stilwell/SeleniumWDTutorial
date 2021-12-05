package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverMac {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://learn.letskodeit.com/";
		driver.get(baseURL);
	}

}
