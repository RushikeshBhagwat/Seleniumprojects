import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		// Clicking on webelement
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();

		// Firstly switch to top frame
		driver.switchTo().frame("frame-top");

		// Switch to middle frame
		driver.switchTo().frame("frame-middle");

		// printing the text in console displayed inside the middle frame
		System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());

		driver.switchTo().defaultContent();
		driver.quit();
	}

}
