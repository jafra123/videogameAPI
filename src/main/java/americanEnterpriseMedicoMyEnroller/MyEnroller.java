package americanEnterpriseMedicoMyEnroller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyEnroller {
	

	static WebDriver driver;// new ChromeDriver();

	WebDriverWait wait; 
	
	@BeforeClass
		public void do1() {
		
			// TODO Auto-generated method stub
		System.out.println("hi");
		String URL = "https://quickquote.myenroller.com/MobileQuoteDemographics.aspx";
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();

	}
		
	@Test (priority =1)
		public void nextpageTest1() throws InterruptedException {
		
		String a = "//select[@id='ContentPlaceHolder1_ddlGender']";

		WebElement gender = driver.findElement(By.xpath(a));

		Select select1 = new Select(gender);
		select1.selectByValue("Female");

		String ZipCode = "//input[@id='ContentPlaceHolder1_txtZipCode']";

		driver.findElement(By.xpath(ZipCode)).sendKeys("60051");

		String Age = "//input[@id='ContentPlaceHolder1_txtAge']";

		driver.findElement(By.xpath(Age)).sendKeys("47");

		String Select2 = "//select[@id='ContentPlaceHolder1_ddlState']";
		Thread.sleep(2000);
		WebElement State = driver.findElement(By.xpath(Select2));

		Select select2 = new Select(State);
		select2.selectByValue("IL");

		String Select3 = "//select[@id='ContentPlaceHolder1_ddlProduct']";

		WebElement product = driver.findElement(By.xpath(Select3));

		Select select3 = new Select(product);
		select3.selectByValue("HI");

		String button = "//button[@id='ContentPlaceHolder1_btnSetProductInfo']";
		driver.findElement(By.xpath(button)).click();

		//String Next = "//button[@id='ContentPlaceHolder1_btnSetProductInfo']";
	}
		@Test (priority =2)
		public void nextpageTest() {
			wait  =new  WebDriverWait(driver, 20);
	  // WebElement NextSelectProductDetails= 	driver.findElement(By.xpath("//button[@id='ContentPlaceHolder1_btnSetProductInfo']"));
		
	//	wait.until(ExpectedConditions.elementToBeClickable(NextSelectProductDetails)).click();;
//	wait for visibilit of Next - Select Product Details
		
		WebElement getCodeButton= 	driver.findElement(By.xpath("//button[@id='ContentPlaceHolder1_btnGetQuote']"));	
		wait.until(ExpectedConditions.elementToBeClickable(getCodeButton)).click();;
		//driver.findElement(By.xpath(getCodeButton)).click();
		}
		}

