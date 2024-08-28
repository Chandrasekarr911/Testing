package comWebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D18HandlingRadiobtn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement femaleRadio = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
		
		System.out.println("Before...");
		System.out.println("Selected: " + femaleRadio.isSelected());
		System.out.println("Visible : " + femaleRadio.isDisplayed());
		System.out.println("Enable  : " + femaleRadio.isEnabled());
		
		femaleRadio.click();
		
		System.out.println("After...");
		System.out.println("Selected: " + femaleRadio.isSelected());
		System.out.println("Visible : " + femaleRadio.isDisplayed());
		System.out.println("Enable  : " + femaleRadio.isEnabled());
	
		driver.close();
	
	}

}
