package comWebdriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14LocateMultiplecontrols {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		List<WebElement>txtboxes = driver.findElements(By.cssSelector("input[class=\"form-control\"]"));
		txtboxes.get(0).sendKeys("dhanshri");
		txtboxes.get(1).sendKeys("dhanshri123");
		driver.findElement(By.xpath("//*[@id=\"Butsub\"]")).click();
		
		
		
		
		
		
		
	}

}
