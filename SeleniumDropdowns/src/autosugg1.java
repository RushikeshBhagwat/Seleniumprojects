import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autosugg1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("aus");
		Thread.sleep(1000);
	
		List<WebElement> ty=driver.findElements(By.cssSelector("li.ui-menu-item"));
		for(WebElement st: ty) {
			if(st.getText().equalsIgnoreCase("Australia"))
			{
			 st.click();
			 break;
		}
			
	}
		//printing the text in the output by using getAttribute method
		System.out.println(driver.findElement(By.cssSelector("input#autocomplete")).getAttribute("value"));
  driver.quit();
}
}
