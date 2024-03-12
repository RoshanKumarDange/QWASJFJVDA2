package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateActitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.get("http://127.0.0.1/login.do;jsessionid=o3ee6f9eko1x");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager"); 
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("//input[@value=\"Create New User\"]")).click(); 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Roshan");
		driver.findElement(By.xpath("//input[@name=\"passwordText\"]")).sendKeys("Roshan@123");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("Roshan@123");
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Roshan");
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("8889218450");
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Dange");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
		
		
		

	
