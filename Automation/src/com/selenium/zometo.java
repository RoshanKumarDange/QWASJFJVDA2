package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zometo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.zomato.com/");
	    driver.findElement(By.xpath("(//p[@class='sc-elhb8j-16 dxcfRo'])[9]")).click();
	    driver.findElement(By.xpath("//button[@class='btn location-box mask-button']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("suger",Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='AddToCart__UpdatedButtonContainer-sc-17ig0e3-0 lmopxc'])[1]")).click();
	    Thread.sleep(2000);
	    WebElement product = driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']"));
	    
	    for(int i=0; i<=1; i++)
	    {
	     Thread.sleep(2000);
	     product.click();
	    }
	    driver.findElement(By.xpath("//div[@class='CartButton__CartIcon-sc-1fuy2nj-6 iyUoPU']")).click();
	}

}
