package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver=new ChromeDriver();
  @Test
  public void f() {
	  System.out.println("Login Script");
	  System.setProperties("webdriver.chrome.driver","C:\Users\A08019DIRP_C2C.02.02\workspace\JenkinsTestIntegration\chromedriver.exe");;
	  driver.get("https://ttdsevaonline.com/#/login");
	  driver.findElement(ByName("uName")).sendkeys("pujithanaga7@gmail.com");
	  driver.findElement(ByName"pwd").sendKeys("Banumati@1989");
	  driver.findElement(ById("login_sub")).click();
  }
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("In bfore method annaoation");
	// TODO Auto-generated method stub

}
  @AfterMethod
  public void aftermethod() {
	  System.out.println("In After Metod Annotation");
  }
  
}
