import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiseForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='name'][1]")).sendKeys("jvjscn");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email'][1]")).sendKeys("vfdvbfv@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vfd");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		WebElement ty=driver.findElement(By.cssSelector("#exampleFormControlSelect1"));
		Select st=new Select(ty);
		st.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("10/12/2022");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		driver.close();
		
		
		
	}

}
