package comWebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D008LocatorbyLinkTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement Gmaillink=driver.findElement(By.linkText("Images"));
		Gmaillink.click();
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		if(title.equals("Google Images"))
		System.out.println("Title is matched");
		else
			System.out.println("Title is not matched");
		
	
	}

}
