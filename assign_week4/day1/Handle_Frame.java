package assign_week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Frame {

	public static void main(String[] args) {
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	    driver.findElement(By.xpath("//div[text()='Accept all & visit the site']")).click();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();
	    Alert confirm = driver.switchTo().alert();
	    String tex = confirm.getText();
	    System.out.println(tex);
	    confirm.accept();
	    String tex1 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	    System.out.println(tex1);
	    if(tex1.contains("Harry")) {
	    	System.out.println("Alert dismissed successfully");
	    }
	    else {
	    	System.out.println("Alert not  dismissed successfully");
	    }
	    
	    

	}

}
