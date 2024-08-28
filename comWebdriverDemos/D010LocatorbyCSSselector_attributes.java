package comWebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D010LocatorbyCSSselector_attributes {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement Us=driver.findElement(By.cssSelector("input[placeholder=\"Email address or phone number\"]"));
	    Us.sendKeys("Chandrasekar305@rocketmail.com");
	    WebElement Ps=driver.findElement(By.cssSelector("input[data-testid=\"royal_pass\"]"));
	    Ps.sendKeys("Archana@12345");
	    WebElement Lg=driver.findElement(By.cssSelector("button[data-testid=\"royal_login_button\"]"));
	    Lg.click();
	
	    String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		if(title.equals("Log in to Facebook"))
		System.out.println("Title is matched");
		else
			System.out.println("Title is not matched");
	
	}
	
	

}
