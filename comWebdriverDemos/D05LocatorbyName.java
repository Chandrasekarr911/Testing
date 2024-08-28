package comWebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocatorbyName {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.name("email"));
	    email.sendKeys("pavichandru6@gmail.com");
	    
	    WebElement pass= driver.findElement(By.name("pass"));
	    pass.sendKeys("Archana");
	    
	    WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	
	
	
	
	
	
	
	
	}

}
