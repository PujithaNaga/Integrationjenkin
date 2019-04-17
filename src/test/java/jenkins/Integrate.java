package jenkins;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Integrate {
	public WebDriver driver;
	
  @Test
  public void f() {
	  System.out.println("Login Script");
	  
	  
	 driver.findElement(By.name("uName")).sendKeys("pujithanaga7@gmail.com");
     driver.findElement(By.name("pwd")).sendKeys("Banumati@1989");
     driver.findElement(By.id("login_sub")).click();
  }
  @BeforeTest
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\workspace\\JenkinsTestIntegration\\chromedriver.exe");;
	  driver=new ChromeDriver();
	  driver.get("https://ttdsevaonline.com/#/login");
	  System.out.println("In Before method");
  }

  @AfterTest
  public void afterMethod() {
	  System.out.println("In After method");
	  driver.close();
  }

}
