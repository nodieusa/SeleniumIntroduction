import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
//		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Select sAdults = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		sAdults.selectByValue("2");

		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
		
		//driver.quit();
	}

}
