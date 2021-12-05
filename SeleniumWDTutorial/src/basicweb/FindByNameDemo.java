package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByNameDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://courses.letskodeit.com/practice";
		driver.get(baseURL);
		
		driver.findElement(By.name("enter-name")).sendKeys("automation");
	}
}
