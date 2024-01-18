package assign_week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		String title =driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handle = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handle.get(1));
		
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		driver.switchTo().window(handle.get(0));
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(handles.get(1));
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		driver.switchTo().window(handle.get(0));
		driver.findElement(By.className("buttonDangerous")).click();
		driver.switchTo().alert().accept();
		/*
		 * String verify =
		 * driver.findElement(By.xpath("//div[text()='View Contact']")).getText();
		 * 
		 * System.out.println("Title :" +verify);
		 */
		driver.close();
		
	
	}

}
