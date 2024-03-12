package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {


public static void main(String[] args){
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().getImplicitWaitTimeout().dividedBy(20);
	driver.get("https://www.facebook.com/");
	WebElement usrname = driver.findElement(By.id("email"));
	usrname.sendKeys("8889218450");
	WebElement pwd = driver.findElement(By.id("pass"));
	pwd.sendKeys("Roshan@123");
	driver.findElement(By.name("login")).click();
}
}
	
	
	


