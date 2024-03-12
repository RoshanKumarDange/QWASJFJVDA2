package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchVistara {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();
	
		driver.findElement(By.xpath("//input[@aria-label='Search origin']")).sendKeys("BETUL");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\'flightSearchFrom\']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search destination']")).sendKeys("BHOPAL");

		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-date=\'3\']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='4']")).click();

		driver.findElement(By.xpath("//input[@id=\'passengers\']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\'adult\']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Done'])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
	}

}


