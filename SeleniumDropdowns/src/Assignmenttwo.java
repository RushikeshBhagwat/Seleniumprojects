import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignmenttwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input#checkBoxOption2")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("label[for='benz']")).getText());
		String dy=driver.findElement(By.cssSelector("label[for='benz']")).getText();
		WebElement sy=driver.findElement(By.cssSelector("select#dropdown-class-example"));

		Thread.sleep(1000);
		Select ele=new Select(sy);
		ele.selectByVisibleText(dy);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder=\"Enter Your Name\"]")).sendKeys(dy);
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		String alertmsg=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		if(alertmsg.contains(dy)) {
			System.out.println("Alert message contains selected option2");
			
		}
        
	}

}
