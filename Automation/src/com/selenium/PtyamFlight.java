package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PtyamFlight {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src=\"https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png\"]")).click();
		
		//from
		driver.findElement(By.xpath("(//span[@class=\"_3xDDz\"])[1]")).click();
		
		//cut
		driver.findElement(By.className("_3i2Wp")).click();
		Thread.sleep(2000);
		
		//pass the value
		driver.findElement(By.xpath("//input[@class=\"_1X2Sn\"]")).sendKeys("ayj");
		Thread.sleep(2000);
		
		//select the value from dropdown
		driver.findElement(By.xpath("//div[text()='Ayodhya, Uttar Pradesh, India']")).click();
		
		//to
		driver.findElement(By.xpath("(//span[@class=\"_3xDDz\"])[2]")).click();
		
		//cut
		driver.findElement(By.className("_3i2Wp")).click();
		
		//pass value
		driver.findElement(By.xpath("//input[@class=\"_1X2Sn\"]")).sendKeys("PNQ");
		Thread.sleep(2000);
		
		//select value from dropdown
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		// click on departure
		driver.findElement(By.xpath("//span[@id='departureDate']")).click();
		//select date
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='18'])[2]")).click();
		//flightSearch
		driver.findElement(By.id("flightSearch")).click();
		Thread.sleep(2000);
		 WebElement flightprice = driver.findElement(By.xpath("(//button[text()='Book Flight']/ancestor::div[@class='_5Cbbf']/descendant::div[@class='_2MkSl'])[1]"));
	        String flightsearch = flightprice.getText();
	        System.out.println(flightsearch);
			
		
	}

}
