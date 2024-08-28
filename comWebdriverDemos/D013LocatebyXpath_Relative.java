package comWebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D013LocatebyXpath_Relative {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Chandrasekar305@rocketmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Password@123");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		
		
		
	}

}
