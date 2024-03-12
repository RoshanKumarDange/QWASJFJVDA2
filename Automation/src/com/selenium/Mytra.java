package com.selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("desktop-searchBar")).sendKeys("pant",Keys.ENTER);
		List<WebElement> pantprice = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
	    List<WebElement> pantname = driver.findElements(By.xpath("//h3[@class='product-brand']"));
	    
	    for(int i=0; i<=pantname.size(); i++)
	    {
	    	System.out.println(pantprice.get(i).getText() + "===================>" + pantname.get(i).getText());
	    }
	    	
	  
	
	}
}
