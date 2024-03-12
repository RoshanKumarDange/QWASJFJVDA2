package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ptymflight {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		
		driver.get("https://paytm.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		// CLICK on flight tickets
		driver.findElement(By.xpath("//div[2][@class=\"_2EGQY\"]")).click();
		driver.findElement(By.className("_3xDDz")).click();
		driver.findElement(By.className("_3i2Wp")).click();
		driver.findElement(By.className("_1X2Sn")).sendKeys("PNQ");
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		
		
		// to
		
		driver.findElement(By.id("to")).click();
		driver.findElement(By.className("_3i2Wp")).click();
        driver.findElement(By.className("_1X2Sn")).sendKeys("AYJ");
        driver.findElement(By.xpath("//div[text()='Ayodhya, Uttar Pradesh, India']")).click();

        
        //date
        
        driver.findElement(By.id("departureDate")).click();
        driver.findElement(By.xpath("(//div[text()='5'])[2]")).click();
        
        
        driver.findElement(By.id("flightSearch")).click();
        
        
        
        //book ticket
        WebElement flightprice = driver.findElement(By.xpath("(//button[text()='Book Flight']/ancestor::div[@class='_5Cbbf']/descendant::div[@class='_2MkSl'])[1]"));
        String flightsearch = flightprice.getText();
        System.out.println(flightsearch);
		
	}

}

