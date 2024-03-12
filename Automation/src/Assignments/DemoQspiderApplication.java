package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspiderApplication {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//li[@class=\"w-[100%] flex justify-between items-center py-1  cursor-pointer  px-2 relative ps-1  text-[14px]  text-black\"]")).click();
	    WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
	    {
	    	System.out.println(Name.isEnabled());
	    }
	     
		
	}

}
