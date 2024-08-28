package comWebdriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Demre {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		Email.sendKeys("Admin");
		WebElement Pass=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		Pass.sendKeys("admin123");
		WebElement LgnBtn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		LgnBtn.click();
		
		WebElement Logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
		Logo.click();
		
	//	WebElement Logout=driver.findElement(By.linkText("Logout"));
		
	//	Logout.click();
	//	driver.close();
		WebElement Optn=driver.findElement(By.cssSelector())
		WebElement Admn=driver.findElement(By.partialLinkText("Admin"));
		Admn.click();
		
		
		
		
		
		
		
		
		
	}

}
