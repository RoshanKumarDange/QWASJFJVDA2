package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchNetflixwithXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/login");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("roshandange99@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Roshan@123");
		driver.findElement(By.xpath("//button[@role='button'][1]")).click();
		
		
		
		
	}

}
