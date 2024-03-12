package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoapp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//main[@class=\"w-[100%] h-[14.5rem] ps-7 flex flex-col justify-around p-[0.5rem] rounded  bg-[#feebfc]  hover:shadow-slate-400 shadow-lg group\"]")).click();
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[5]")).click();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8889218458");
		
	
        WebElement Country = driver.findElement(By.xpath("//select[@id=\"select3\"]"));
        Thread.sleep(2000);
        Select d = new Select(Country);
        d.selectByIndex(3);
        
        
	}

}
