package assign_week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 WebElement mensF =
		 driver.findElement(By.xpath("//span[@class='catText']"));
		 Actions act = new Actions(driver); 
		 act.moveToElement(mensF).perform();
		 driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		List<WebElement> sports = driver.findElements(By.tagName("a"));
		int size = sports.size();
		System.out.println("Total Count of sports shoes : " +size);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("//li[@class='search-li sort-active']")).click();
		WebElement click =driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
		Actions act1 = new Actions(driver);
		act1.clickAndHold(click).perform();
		
		driver.findElement(By.xpath("//div[@class='price-input']/following-sibling::div[2]")).click();
		WebElement ele =driver.findElement(By.xpath(" (//a[@class='dp-widget-link noUdLine hashAdded'])[1]"));
		driver.executeScript("arguments[0].click();",ele);
		Thread.sleep(2000);
		WebElement view =driver.findElement(By.xpath("//source[@class='product-image']//following::img"));
		//driver.findElement(By.xpath("(//img[@title='RICKENBAC Black Training Shoes'])[4]"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(view).perform();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		String price = driver.findElement(By.xpath("//span[@class='pdp-final-price']']")).getText();
		System.out.println("price of shoe :" +price);
		String offer = driver.findElement(By.xpath("//span[@class='pdpDiscount ']")).getText();
		System.out.println("discount offer price of shoe :" + offer);
		
		WebElement webElement = driver.findElement(By.xpath("(//img[@class='cloudzoom'])[1]"));
		File src = webElement.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/snapdeal.png");
		FileUtils.copyFile(src, dest);
		 driver.close();
		 driver.switchTo().window(handles.get(0));
		 driver.close();
		 
		
		
		
		
		
		
		
		
		
		 
		
		
		  
		
		
		/*
		 * WebElement sports =
		 * driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")); Actions
		 * act1 = new Actions(driver); act1.moveToElement(sports).perform();
		 */
	}

}
