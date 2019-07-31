package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void verifyTitle() {
	  System.setProperty("webdriver.chrome.driver", "/Users/kedarkulkarni/Desktop/Sunsoft_IBM/Selenium Project/src/chromedriver");
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com");
      String x = driver.getTitle();
      String y = driver.getCurrentUrl();
      System.out.println(x);
      System.out.println(y);
      driver.findElement(By.id("email"));
      Assert.assertEquals(x,"Facebook – log in or sign up");
      Assert.assertEquals(y, "https://www.facebook.com/");
  }
  
  @Test
  public void verifyUrl() {
	  System.setProperty("webdriver.gecko.driver", "/Users/kedarkulkarni/Desktop/Sunsoft_IBM/Selenium Project/src/geckodriver");
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  String x = driver.getCurrentUrl();
	  System.out.println(x);
	  Assert.assertEquals(x, "https://www.google.com/");
  }
  
}
