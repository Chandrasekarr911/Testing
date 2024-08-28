package comWebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01LaunchingChrome {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		//driver.findElement(By.xpath("//*[@id=\"input\"]");        
		driver.close();
	}

}
