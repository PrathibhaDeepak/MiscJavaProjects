package selOne;

import org.openqa.selenium.WebDriver; import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Execution after setting EdgeDriver path in System Variables on Windows!!");
		
		WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "\"C:\\Users\\prath\\Downloads\\edgedriver_win64\\msedgedriver.exe\"");
		driver.get("www.google.com");
	}

}
