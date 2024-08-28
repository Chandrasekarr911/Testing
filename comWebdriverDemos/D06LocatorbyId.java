package comWebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocatorbyId {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailId=driver.findElement(By.id("email"));
		
		emailId.sendKeys("chandrasekar305@rocketmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Archana");
		
		WebElement loginBtn=driver.findElement(By.id("login"));
		loginBtn.click();
	
		
		//It throws a exception of org.openqa.selenium.NoSuchElementException. 
		//Unable to locate the element in the line 20
		//The id of the login button is constantly changing.
		
		
		
		
		
		
		
	}

}
