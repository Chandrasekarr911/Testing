package comWebdriverDemos;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D23HandlingTables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	   //List<WebElement>header=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th"));
	    List<WebElement> header=driver.findElements(By.tagName("th"));
	    
	   for(WebElement h : header)
			System.out.println(h.getText());
	
	  List<WebElement>Rows= driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
	  System.out.println("Total no.of rows: "+Rows.size());
	
	  Random rnd=new Random();
	  int i=rnd.nextInt(Rows.size());
	  
	  
	System.out.println(Rows.get(i).getText());
	
	driver.close();
	
	}

}
