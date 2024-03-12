package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MytraLouch {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().getImplicitWaitTimeout().dividedBy(20);
		driver.findElement(By.className("desktop-searchBar")).sendKeys("pant",Keys.ENTER);
		driver.findElement(By.xpath("class=\"vertical-filters-header\"")).click();
		//driver.findElement(By.xpath("")
	}

}
