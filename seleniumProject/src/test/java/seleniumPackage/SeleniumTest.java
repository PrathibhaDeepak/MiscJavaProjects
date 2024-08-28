package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.seleniumhq.selenium.remote_driver;

public class SeleniumTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		driver.quit();

	}

}
