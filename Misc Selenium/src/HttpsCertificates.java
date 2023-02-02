import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HttpsCertificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeOptions class
		ChromeOptions option=new ChromeOptions();
		//Here we are using setaccept method and setting its value to true so that insecure link error will be bypassed
		option.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");
    //Passing option argument so that ChromeDriver will know the knowledge
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
