package assign_week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Oneplus9pro",Keys.ENTER);
		 //get text of first price value
		String firstPrice= driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
        System.out.println("first product value :" +firstPrice);
        
		/*
		 * String ratings=driver.findElement(By.
		 * xpath("//i[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom']"
		 * )).getText(); System.out.println("no.of customer ratings :" +ratings);
		 */
	    
        //print the customer ratings
		 String cRatings=driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText(); 
		 System.out.println("no.of customer ratings :" +cRatings);
		 //click the first link of first image
		 driver.findElement(By.xpath("//img[@class='s-image']")).click();
		 Thread.sleep(2000);
		 //swith control to firstproduct page
		 Set<String> handles = driver.getWindowHandles();
		 //convert list into set
		 List<String> wHandles = new ArrayList<String>(handles);
		 driver.switchTo().window(wHandles.get(1));
		 String cTitle =driver.getTitle();
		 System.out.println("childWiindow Title :" +cTitle);
		 //get Screenshot of child window
		 WebElement sShot = driver.findElement(By.xpath("//div[@id='dp-container']"));
		 File source=sShot.getScreenshotAs(OutputType.FILE);
		 //create object for file cls
		 File dest = new File("./snaps/amazonmbl.png");
		 FileUtils.copyFile(source, dest);
		 //click add to cart
		 WebElement addCart = driver.findElement(By.id("add-to-cart-button"));
		 driver.executeScript("arguments[0].click();",addCart);
		 WebElement subTotal = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		 Actions act =new Actions(driver);
		 act.moveToElement(subTotal).perform();
		 String total = subTotal.getText();
		 if(total.contains(firstPrice)) {
			 System.out.println("Texts are equal ");
		 }
		 else {
			 System.out.println("Texts are not equal");
		 }
		// driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
		 driver.close();
		 Thread.sleep(2000);
		 driver.switchTo().window(wHandles.get(0));
		 driver.close();
		 
		 
		 
		 
		 
		 
		 
		 
	
	
	
		 
	}
	

}
