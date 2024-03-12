package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("roshandange99@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Roshan@123");
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"/books\"])[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		WebElement select = driver.findElement(By.id("CountryId"));
		Select s = new Select(select);
		s.selectByIndex(15);
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//input[@title='Continue'])[1]")).click();
		driver.findElement(By.xpath("(//input[@title='Continue'])[2]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[3]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[5]")).click();
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click here for order details.")).click();
		driver.findElement(By.xpath("//a[@class=\"button-2 pdf-order-button\"]")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
		
		
		
	
}

