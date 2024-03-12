package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramforgetpassword {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		   WebElement username = driver.findElement(By.name("username"));
			username.sendKeys("8889218450");
			WebElement pwd = driver.findElement(By.name("password"));
			pwd.sendKeys("Roshan@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/a/span")).click();
	}

}
