import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(1000);
        //Navigating to first table and printing number of rows
       System.out.println(driver.findElements(By.xpath("(//fieldset//tbody)[1]//tr")).size());
     //Navigating to first table and printing number of rows
       System.out.println(driver.findElements(By.xpath("(//fieldset//tbody)[1]//th")).size());
       //printing the table content present inside the third row
       System.out.println(driver.findElement(By.xpath("(//fieldset//tbody)[1]//tr[3]")).getText());
       driver.quit();
	}

}
