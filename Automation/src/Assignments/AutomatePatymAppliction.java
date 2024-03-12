package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatePatymAppliction {
	    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//div[2][@class=\"_2EGQY\"]")).click();	
		driver.findElement(By.xpath("//span[@class=\"_38H9z\"]")).click();
		driver.findElement(By.xpath("//img[@src=\"//travel-assets-akamai.paytm.com/travel/mweb-flights/assets/7b29a32c.svg\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"_1X2Sn\"]")).sendKeys("Ayodhya, Uttar Pradesh, India");
        driver.findElement(By.xpath("//div[@class=\"_2wpHf\"]")).click();      
        driver.findElement(By.xpath("//span[@id='destCode']")).click();
        driver.findElement(By.xpath("//img[@src=\"//travel-assets-akamai.paytm.com/travel/mweb-flights/assets/7b29a32c.svg\"]")).click();
		driver.findElement(By.xpath("//span[@id='destCode']")).click();
		driver.findElement(By.xpath("//div[@class='lM769']")).click();

		
	}
}