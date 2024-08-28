package comWebdriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04ReadURL {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
        String url=driver.getCurrentUrl();
		
		System.out.println("Current url: "+url);
		
		driver.close();	
	
	
	
	
	
	
	
	
	
	
	}

}
