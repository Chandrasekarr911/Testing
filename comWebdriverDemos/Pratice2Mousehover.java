package comWebdriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Pratice2Mousehover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
	WebElement products=driver.findElement(By.xpath("//button[@id='products-dd-toggle']"));
	Actions action=new Actions(driver);
	action.moveToElement(products).perform();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement submenu=driver.findElement(By.xpath("//*[@id=\"products-dd-tabpanel-1-inner-1\"]/div[2]/div[5]/a/span"));
	
	action.moveToElement(submenu).perform();
	action.click().build().perform();
	
	}

}
