package comWebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class D016LocatebyRelativeLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staragile.melimu.com/");
		
driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("password"))).sendKeys("chandrasekarr911@gmail.com");
		
driver.findElement(RelativeLocator.with(By.id("password")).below(By.tagName("input"))).sendKeys("Chand@0874");		
		
driver.findElement(RelativeLocator.with(By.tagName("button")).below(By.id("password"))).click();	
		
		
		
		
		
		
		
		
		
		
	}

}
