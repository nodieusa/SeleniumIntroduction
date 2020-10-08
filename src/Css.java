import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "c:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("abcdef");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		driver.quit();
		
				
/*
				Css = tagname[attribute='value']
						div[class='identity first']
				xpath = // tagname[@attribute='value']
*/
	}

}
