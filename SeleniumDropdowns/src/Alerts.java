import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Rushi");
		driver.findElement(By.id("alertbtn")).click();

		// Printing the alert msg in console
		System.out.println(driver.switchTo().alert().getText());
		// Clicking on ok button in alert
		driver.switchTo().alert().accept();

		// Second type of alert
		driver.findElement(By.id("name")).sendKeys("Rushikesh");
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		// Clicking on cancel button
		driver.switchTo().alert().dismiss();

	}

}
