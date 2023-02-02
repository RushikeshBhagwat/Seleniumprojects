import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com/");
		driver.findElement(By.xpath("(//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb'])[1]")).click();
		String date="23";
		//logic to select April 2023 month
		while(true) {
			if(driver.findElement(By.xpath("(//div[@class='bui-calendar__month'])[1]")).getText().equalsIgnoreCase("April 2023")) {
				break;
			}
			else {
				driver.findElement(By.xpath("//div[@class='bui-calendar__control bui-calendar__control--next']")).click();
			}
		}
		//logic to select 23 date
		java.util.List<WebElement> ele= driver.findElements(By.xpath("(//div[@class='bui-calendar__wrapper'])[1]//td[@class='bui-calendar__date']"));
		int count=ele.size();
		Thread.sleep(2000);
		for(int i=0;i<count;i++) {
			if(ele.get(i).getText().equals(date)) {
				ele.get(i).click();
				break;
			}
		}
}
}
