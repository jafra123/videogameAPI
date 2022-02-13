	
	import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

	public class RemoteWebDriver1 {
		public static void main(String[] args) throws MalformedURLException {
			
		FirefoxOptions opt = new FirefoxOptions();   // For firefox
		//ChromeOptions opt = new ChromeOptions();   // for Chrome
		//WebDriver driver = new RemoteWebDriver (new URL("http://192.168.1.24:4444"), opt);
		//WebDriver driver = new RemoteWebDriver (new URL("http://localhost:4444"), opt);
		WebDriver driver = new RemoteWebDriver (new URL("http://54.211.204.225:4444/ui/index.html#/"), opt);
		
		
		
			//WebDriverManager.chromedriver().setup();
			//WebDriver driver = new ChromeDriver();				
			
		
		driver.get("https://www.google.com");	
		
		
	//	@FindBy(name ="q")
	//	private WebElement name1;
		driver.findElement(By.name("q")).sendKeys("hello");
			
		}	
}
