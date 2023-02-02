import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;//td[1]
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//Program of webtable sorting using streams
public class Webtablesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//1.Clicking on the first column in table to get the sorted table
		driver.findElement(By.xpath("//th[1]")).click();
		
		//2. Capturing all the elements into the list
		List<WebElement> element=driver.findElements(By.xpath("//td[1]"));
		
		//3. Capturing the text of elements using streams and then store it into one list variable
		List<String> originallist=element.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//4. Sorting the captured list and store it into new list
		List<String> sortedlist=originallist.stream().sorted().collect(Collectors.toList());
		
		//5 Checking sortedlist and originallist is same or not using assertions
		Assert.assertTrue(originallist.equals(sortedlist));
		
	}

}
