
	import java.util.ArrayList;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;
	

	public class Test1 {
	
		/*
		 * Dynamic Controls

	Test clicks on the Remove Button and uses explicit wait.
	Test asserts that the checkbox is gone.
	Test clicks on Add Button and uses explicit wait.
	Test asserts that the checkbox is present.
	Test clicks on the Enable Button and uses explicit wait.
	Test asserts that the text box is enabled.
	Test clicks on the Disable Button and uses explicit wait.
	Test asserts that the text box is disabled.
		 */
		WebDriver driver ;	
		 @BeforeTest
		public void start() {	
		WebDriverManager.chromedriver().setup();  // it will check the catche local if not it will download ant take care everythinh
		 driver = new ChromeDriver();
		 driver.get("http://localhost:7080/dynamic_controls");	
		}
		 @Test
	
		 
		 public void clicksonRemoveButtonusesexplicitewait () throws InterruptedException {
			
			 //=  driver.findElement(By.xpath("//button[text()='Remove']"));
			 
			
			 
			 WebDriverWait wait=new WebDriverWait(driver, 20);
			 WebElement a =driver.findElement(By.xpath("//button[text()='Remove']"));
			 a.click();	
			// wait.until(ExpectedConditions.visibilityOf(a));		
			//	a.click();			
			//	List<WebElement> ab = driver.findElements(By.id("checkbox")) ;	 
			 Thread.sleep(2000);  
			 boolean  isdisp= 	driver.findElement(By.id("checkbox")).isDisplayed();
				System.out.println(isdisp);
				
				
		 }
		
	}

	

