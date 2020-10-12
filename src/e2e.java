import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
/*		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		System.out.println("print: " + driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("value"));
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
*/
		Select sDeparture = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		sDeparture.selectByValue("BLR");
//		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//		Select sArrival = new Select(driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")));
		Select sArrival = new Select(driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1']")));
		sArrival.selectByValue("MAA");
		Thread.sleep(3000);
		driver.quit();
	}

}
