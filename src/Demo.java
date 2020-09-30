import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "//usr//local//bin//chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--whitelisted-ips 172.217.9.46");
		WebDriver driver = new ChromeDriver (options);
	
		System.out.println(driver.getTitle());
		driver.get("https://google.com");
	
		
	}
}
