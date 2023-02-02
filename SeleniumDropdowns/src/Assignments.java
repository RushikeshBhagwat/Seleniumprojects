import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 1. Getting the links count present in the page

		// Remember links starts with a tag in DOM hence we will write the driver
		// according to that
		driver.get("https://qaclickacademy-com.mutawakkil.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2. Getting the links count present in the footer in the same page

		// To get that count firstly will have to limit the scope of driver to footer
		// only i.e.Limiting webdriver scope concept

		WebElement footerdriver = driver.findElement(By.cssSelector("body footer"));

		// Now we will print the number of links in the output present in the page

		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3. Open the links in new tab present in the third column of the footer section
		
		//Firstly we will limit the scope of driver to third column in the footer section
		        WebElement columndriver=footerdriver.findElement(By.cssSelector("div.navigation"));
		        
		//Print the links present in the third column of the footer section
		  System.out.println(columndriver.findElements(By.tagName("a")).size());
		  
		
		  
		  //For loop to iterate over the links and open it new tab
		  for(int i=0;i<columndriver.findElements(By.tagName("a")).size();i++) {
			  
			//Now we will click on the every link present in the third column and will open in new tab by pressing ctrl+enter key from keyboard
			  String kt=Keys.chord(Keys.CONTROL,Keys.ENTER);
			  
			//Navigating to the link and clicking
			  columndriver.findElements(By.tagName("a")).get(i).sendKeys(kt);
		  }
		  
		  //will use one more loop to print the title of the pages
		  Thread.sleep(3000);
		  Set<String> abc=driver.getWindowHandles();
		  java.util.Iterator<String> it= abc.iterator();
		  
		  while(it.hasNext()) {
			  driver.switchTo().window(it.next());
			   System.out.println(driver.getTitle());
		  }
		  
	}

}
