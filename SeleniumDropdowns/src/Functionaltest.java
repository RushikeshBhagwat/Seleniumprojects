
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functionaltest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int j = 0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		String[] sty = { "Brocolli", "Cucumber", "Beetroot" };
		java.util.List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
		// iterating through the list
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();

			// Here we will use string methods to get the actual string such as Cucumber or Beetroot
			
			String[] formatedname = name.split("-");
			String itemsneeded = formatedname[0].trim();
			// Converting array to arraylist for easy search
			java.util.List<String> lst = Arrays.asList(sty);

			// Using if condition
			if (lst.contains(itemsneeded)) {
				// Clicking on add to cart
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				// Here we cant use break keyword to complete the search and exit the loop hence
				// we will be using one if loop to terminate
				if (j == 3) {
					break;
				}

			}
		}
	}
}
