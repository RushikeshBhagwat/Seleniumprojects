import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		//Clicking on checkbox
		driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
		
		//Verifying if it is successfully clicked or not by using assertions
		Assert.assertTrue(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
		Thread.sleep(1000);
		//Unchecking the checkbox
		driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
		
		//Verifying if it is successfully unchecked or not by using assertions
        Assert.assertFalse(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
        Thread.sleep(1000);
        //Counting the number of checkboxes 
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
