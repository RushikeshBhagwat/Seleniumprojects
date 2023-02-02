
import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;

import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.asserts.SoftAssert;



public class BrokenLinks {



public static void main(String[] args) throws MalformedURLException, IOException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\1769317\\Downloads\\chromedriver.exe");

         WebDriver driver=new ChromeDriver();

         

         //broken URL

         //Step 1 - IS to get all urls tied up to the links using Selenium

         //  Java methods will call URL's and gets you the status code

         //if status code >400 then that url is not working-> link which tied to url is broken

         //a[href*="soapui"]'

         driver.get("https://rahulshettyacademy.com/AutomationPractice/");

         

     //Find all the links from the footer section    

      List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
   // Concept of soft assertions
      SoftAssert a =new SoftAssert();

      for(WebElement link : links)

      {
    	  //Below method will get the actual url and will store it in a variable named url
          String url= link.getAttribute("href");

          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

          conn.setRequestMethod("HEAD");

          conn.connect();
     //Method to capture response code of evry link and store it in one variable
          int respCode = conn.getResponseCode();

          System.out.println(respCode);
      // Below soft assertions will collect all the failures 
          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

      }

     
    // Once the for loop is completed then will have to use below method to report all the failures orelse it will not report
      a.assertAll();

   

     

     

         

         

         

         

         

     

       

       

       

       

       

       

       

       

       

       

       

       

       

       

       

       

         

         

         

}



private static Object getReturnCode(WebElement link) {

// TODO Auto-generated method stub

return null;

}



}


