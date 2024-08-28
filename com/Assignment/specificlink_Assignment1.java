package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class specificlink_Assignment1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//to get a URL from a website
		
		driver.get("https://www.google.com/");
		
		// to select a specific link from the google page
		
		WebElement gmail=driver.findElement(By.partialLinkText("Gmail"));
		// To click on the specific link text
		gmail.click();
		
		driver.close();
		
	}

}
