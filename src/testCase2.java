

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		WebDriver driver = new SafariDriver ();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
}

