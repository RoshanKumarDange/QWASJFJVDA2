package FindElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ipad {
	
	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");	
		driver.findElement(By.name("q")).sendKeys("ipad",Keys.ENTER);
		List<WebElement> ipadname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> ipadprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0;i<ipadname.size();i++)
		{
		   System.out.println(ipadname.get(i).getText() +  "  --------------->" + ipadprice.get(i).getText());
		}
			
	}

}
