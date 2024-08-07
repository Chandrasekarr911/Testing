package Hrm;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmTest 
{
  @Test(dataProvider ="exceldata",dataProviderClass = CostomData.class)

  
  public void login(String un,String psw) throws InterruptedException
  {
	  
	  String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl; 
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //username
	  driver.findElement(By.name("username")).sendKeys(un);
	  //password
	  
	  driver.findElement(By.name("password")).sendKeys(psw);
	  
	  //login
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  
	  Thread.sleep(1000);
	  Utility.getScreenshot(driver);
	  
	  
	  //validation
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
	  System.out.println("Login Pass!");
	  
	  //logout
	  
	  actUrl = driver.getCurrentUrl();

		if (expUrl.equals(actUrl)) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
	
			//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p
}
		  driver.quit();
}

}