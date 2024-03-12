package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noukri {
	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.naukri.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
	 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("RoshanKumarDange");
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Roshandange@633.gamil.com");
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	 driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9009212993");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//h2[@class='main-3'])[2]")).click();
	 driver.findElement(By.xpath("//input[@name='currentCity']")).sendKeys("Puna");
	 driver.findElement(By.xpath("//li[@title='Punasa, Madhya Pradesh']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
	 
	 
	}

}
