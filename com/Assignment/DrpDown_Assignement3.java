package com.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrpDown_Assignement3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//To get a url and xpath of dropdown menus by using the select class.
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		WebElement Drplist=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/center[1]/div/form/select"));
		Select select= new Select(Drplist);
		System.out.println("Selected select:"+select.getFirstSelectedOption().getText());
	    
		//To find the no of elements in the dropdown menu
		List<WebElement>Cofffee=select.getOptions();
		System.out.println("Total no.of coffee: "+Cofffee.size());
		//To print the no of menus in the drop down
		int i=0;
		for (WebElement c: Cofffee )
		{
			
			System.out.println(i + ". "+ c.getText());
		}
	//It is a method in a select class
		select.selectByVisibleText("Black");
		System.out.println("Selected select by visible text:"+select.getFirstSelectedOption().getText());
		//It is a method in a select class
		select.selectByIndex(2);
		System.out.println("Selected select by index:"+select.getFirstSelectedOption().getText());
		//It is a method in a select class
		select.selectByValue("cream");
		System.out.println("Selected select by value:"+select.getFirstSelectedOption().getText());
		
		driver.close();
	}

}
