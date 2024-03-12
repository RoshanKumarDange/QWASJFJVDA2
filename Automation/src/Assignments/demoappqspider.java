package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoappqspider {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//main[@class=\"w-[100%] h-[14.5rem] ps-7 flex flex-col justify-around p-[0.5rem] rounded  bg-[#feebfc]  hover:shadow-slate-400 shadow-lg group\"]")).click();
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[5]")).click();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8889218458");
		
		WebElement
		genderdropdown = driver.findElement(By.id("select2"));
        Select s = new Select(genderdropdown);
        
        s.selectByIndex(1);
        
        WebElement selectCountry = driver.findElement(By.id("select3"));
        Select c = new Select(selectCountry);
        
        c.selectByIndex(2);
        
       WebElement statedropdown = driver.findElement(By.id("select5"));
       Select d = new Select(statedropdown);
       d.selectByIndex(1);
       
       WebElement cityf = driver.findElement(By.id("optionCity"));
       Select f = new Select(cityf);
       f.selectByIndex(1);
        
        
	}

	
}

