package comWebdriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class D17HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		List<WebElement> alt=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[1]/blockquote[1]/form/input"));
		
		 WebElement radio=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[6]"));
		    Actions act= new Actions(driver);
		    act.moveToElement(radio);
		    
	    for(WebElement altMail:alt)
	    {
		System.out.println("Before clicking..");
		System.out.println(altMail.isSelected());
		System.out.println(altMail.isDisplayed());
		System.out.println(altMail.isEnabled());
		
		if(altMail.isSelected()== false);
		altMail.click();
		
		System.out.println("After Clicking...");
		System.out.println(altMail.isSelected());
		System.out.println(altMail.isDisplayed());
		System.out.println(altMail.isEnabled());	
		
		driver.close();
	    }
		
		
		
	}
	    

}
