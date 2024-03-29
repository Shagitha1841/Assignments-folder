package assign_week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Create_Lead extends Base_Lead {

	
		@Test
		public void createLeadTestcase() {
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
			driver.findElement(By.name("submitButton")).click();
			String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			if (text.contains("Testleaf")) {
				System.out.println("Lead created successfully");
			}
			else {
				System.out.println("Lead is not created");
			}
			


		}

	}


