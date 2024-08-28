package com.Assignment;


import java.awt.ScrollPane;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A04_Registrationform {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	//	driver.findElement(By.id("firstName")).sendKeys("Chandra");
	//    driver.findElement(By.id("lastName")).sendKeys("Sekar");
	//    driver.findElement(By.id("userEmail")).sendKeys("chandrasekarr911@gmail.com");
	    Thread.sleep(30);
	    driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("7502005329");
	    driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("StarAgile");
	    
		
		
		
		
		
		
		
		
		
		
		
	}

}
