package comWebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hcmengine.com/FocusEmployeeConnect/login.aspx?ReturnUrl=%2fFocusEmployeeConnect%2fHeaderMenuNew.aspx");
		
		WebElement Employee=driver.findElement(By.name("mainPanel$txtUserID"));
		Employee.sendKeys("C30276");
		WebElement Pass=driver.findElement(By.name("mainPanel$txtPassword"));
		Pass.sendKeys("Portal@12345");
		WebElement Login=driver.findElement(By.name("mainPanel$btnLogin"));
		Login.click();
		
	}

}
