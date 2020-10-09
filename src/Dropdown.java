import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		Thread.sleep(2000);
/*		
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);
		Select sAdults = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		sAdults.selectByValue("5");
		Assert.assertEquals(driver.findElement(By.cssSelector("#divpaxinfo")).getText(), "5 Adult");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
*/
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
		Thread.sleep(3000);
		driver.quit();
	}

}
