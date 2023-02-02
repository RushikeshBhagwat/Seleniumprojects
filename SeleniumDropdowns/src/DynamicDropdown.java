import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		
		//Navigating to dropdown
		driver.findElement(By.xpath("//a[text()=' Adampur (AIP)']")).click();
		 Thread.sleep(1000);
		//Navigating to second dropdown of same dynamic type( Syntax will slight change)
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		Thread.sleep(1000);
		//From the second dropdown we will select arrival with xpath indexing syntax
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//Another way to handle step no 27 i.e //parentxpath childxpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']")).click();
		
	}

}
