import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class firstcode  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		String st=driver.getTitle();
		System.out.println(st);
		String sy=driver.getCurrentUrl();
		System.out.println(sy);
		
		//Locators
		//1.By id, name,classname
		driver.findElement(By.id("email")).sendKeys("bhagwatrushikeshm@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.className("btn-primary")).click();
	    
		//2 By CSS selector(using classname)(Extract text and print in output)
		System.out.println(driver.findElement(By.cssSelector("span.text-with-icon")).getText());
		Thread.sleep(1000);
		
		//Assertions
		Assert.assertEquals(driver.findElement(By.cssSelector("span.text-with-icon")).getText(), "Your email or password is incorrect.");
		
		//3. By linktext locator
		driver.findElement(By.linkText("Forgot Password")).click();
		Thread.sleep(2000);
		
		//4. By Xpath locator
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhagwatrushikeshm@gmail.com");
		
		//5. If we dont have unique attribute for step no 35
		//driver.findElement(By.cssSelector("input[type='email']:nth-child(2)")).sendKeys("bhagwatrushikeshm@gmail.com");
	
		//driver.close();

	}

}
