package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void myntrTest() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		Thread.sleep(4000);
		driver.close();
  }
  
}
