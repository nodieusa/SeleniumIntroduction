import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "//usr//local//bin//chromedriver");
		System.setProperty("webdriver.chrome.driver", "c:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://www.google.com";
//		String url = "chrome://version";
/*		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println("original url: " + url + " current url: " + driver.getCurrentUrl());
		driver.close();
*/ 
		String username = "";
		String password = "";
		driver.get("https://facebook.com"); // URL
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		driver.close();
	}
}
