package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithclassNamemethod {
	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8889218450");
		Thread.sleep(2000);
		driver.findElement(By.className("pass")).sendKeys("Roshan@123");
		driver.findElement(By.name("login")).click();
	}

}
