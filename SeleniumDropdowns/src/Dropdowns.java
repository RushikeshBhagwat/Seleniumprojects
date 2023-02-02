import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Locating the element which will return all the values and will store it in one variable whose type is WebElement
		WebElement staticdropdown=driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		
		//Static dropdowns(Passing webelement into select class)
		Select dropd=new Select(staticdropdown);
		
		//calling methods of select class by using object
		dropd.selectByIndex(0);
		//showing in output console
		System.out.println(	dropd.getFirstSelectedOption().getText());
		
		//calling methods of select class by using object
		dropd.selectByValue("INR");
		
		//showing in output console
	    System.out.println(	dropd.getFirstSelectedOption().getText());
				
	}

}
