import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Navigating to locator element
		driver.findElement(By.cssSelector("div#divpaxinfo")).click();
		Thread.sleep(2000);
		//Navigating to dropdown and adding one adult
		driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
	
		Thread.sleep(2000);
	 //clicking button 3 times
		for(int i=1;i<4;i++) {
			driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("input#btnclosepaxoption")).click();
		
		//capturing the text in console
		System.out.println(driver.findElement(By.cssSelector("div#divpaxinfo")).getText());
	}

}
