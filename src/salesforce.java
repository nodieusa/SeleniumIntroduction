import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		String username = "Hello";
		String password = "1234";
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pw")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("xpath keys");
	}
}
