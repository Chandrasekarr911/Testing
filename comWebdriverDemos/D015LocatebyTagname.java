package comWebdriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D015LocatebyTagname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links   "+links.size());
		
		
		driver.close();	
		
		
		
		
		
		
		
		
		
		
		
	}

}
