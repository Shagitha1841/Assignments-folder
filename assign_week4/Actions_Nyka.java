package assign_week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Nyka {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//mouseover on brands
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions act = new Actions(driver);
		act.moveToElement(brand).perform();
		/*
		 * WebElement search =
		 * driver.findElement(By.xpath("//a[@class='Nav-link active css-1kevcu3']"));
		 * Actions act1 = new Actions(driver); act1.moveToElement(search).perform();
		 */
		//search brand
		driver.findElement(By.id("brandSearchBox")).sendKeys("loreal paris");
		//click loreal paris
		driver.findElement(By.xpath("//div[@id='scroller-container']/div[2]/a")).click();
		//verify title contains loreal paris
		String title =driver.getTitle();
		System.out.println(title);
		if(title.contains("loreal-paris")) {
			System.out.println("Title is equal");
		}
		else {
			System.out.println("Title is not equal");
		}
		//click sort by 
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		//click customer top rated
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		//click category
		driver.findElement(By.xpath("(//div[@class='filter-open css-1gdff5r'])[2]/span")).click();
		//click hair care
		driver.findElement(By.xpath("(//div[@class='active css-1nozswx'])[2]/span")).click();
		//click shampoo
		driver.findElement(By.xpath("(//span[text()='Shampoo'])[2]")).click();
		//click concern
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		//click colour protction
		driver.findElement(By.xpath("//span[text()='Colour Protection']")).click();
		//click loreal clr ptotection shampoo
		driver.findElement(By.xpath("(//div[@class='css-43m2vm'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		//print the MRP 
		 String mrp =driver.findElement(By.xpath("(//div[@class='css-1d0jf8e'])[1]/span[2]")).getText();
		 System.out.println(mrp);
		//click add to bag
		driver.findElement(By.xpath("//button[@class=' css-13zjqg6']")).click();
		//click shopping bag
		 driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		 //print grand total MRP
		String gTotMrp= driver.findElement(By.xpath("//div[@class='css-1mx04mv e25lf6d3']/div[1]/span[1]")).getText();
		System.out.println(gTotMrp);
		//click proceed
		driver.findElement(By.xpath("//div[@class='css-ltzjhp e25lf6d8']/button")).click();
		//click continue as guest
		driver.findElement(By.xpath("//button[(text()='Continue as guest')]")).click();
		driver.close();
		
		
		
		

	}

}
