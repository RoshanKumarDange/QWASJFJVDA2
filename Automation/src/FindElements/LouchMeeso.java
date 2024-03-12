package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LouchMeeso {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("pent",Keys.ENTER);
		 List<WebElement> pentname = driver.findElements(By.xpath("//span[@class='B_NuCI']"));
		List<WebElement> pentprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
			   
		for(int i=0;i<pentname.size();i++)
		{
			   System.out.println(pentprice.get(i).getText() +  "  --------------->" + pentprice.get(i).getText());
			}
				
		}
}
	
		
		
	


