package hwAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//1, Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//2. . Enter UserName and Password Using Id Locator
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    
	    //3. Click on Login Button using Class Locator
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	    //4. Click on CRM/SFA Link
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    //5. Click on Leads Button
	    driver.findElement(By.xpath("//a[text()='Leads']")).click();
	    
	    //6. Click on Create Lead 
	    driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	    
	    //7. Enter CompanyName Field Using id Locator
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
	    
	    //8. Enter FirstName Field Using id Locator
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Uma");
	   
	    // 9. Enter LastName Field Using id Locator
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	    
	    //10. Enter FirstName(Local) Field Using id Locator
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Uma");
	    
	    //11. Enter Department Field Using any Locator of Your Choice
	    driver.findElement(By.name("departmentName")).sendKeys("Testing");
	    
	    //12. Enter Description Field Using any Locator of your choice
	    WebElement descrip = driver.findElement(By.id("createLeadForm_description"));
	    descrip.sendKeys("Test");
	    
	   // 13. Enter your email in the E-mail address Field using the locator of your choice
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("uma@gmail.com");
	    
	   //  14. Select State/Province as NewYork Using Visible Text
	    WebElement stateProv = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select  stateProvdd = new Select(stateProv);
	    stateProvdd.selectByVisibleText("New York");
	   
	   //  15. Click on Create Button
	    driver.findElement(By.name("submitButton")).click();
	    
	    //16. Click on edit button
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    
	    // 17. Clear the Description Field using .clear()
	    driver.findElement(By.id("updateLeadForm_description")).clear();
	    
	   //  18. Fill ImportantNote Field with Any text
	    driver.findElement(By.name("importantNote")).sendKeys("Please check this as Priority");
	    
	   //  19. Click on update button 
	    driver.findElement(By.name("submitButton")).click();
	    
	    //  20. Validate the Title of Resulting Page
	    String title = driver.getTitle();
	    System.out.println(title);


	    
	    

	}

}
