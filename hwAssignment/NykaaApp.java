package hwAssignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NykaaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--disable-notifications"); 
		WebDriver driver=new ChromeDriver(options);
		
		//1, Go to https://www.nykaa.com/
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		//2. Mouseover on Brands and Search L'Oreal Paris
	    WebElement brands= driver.findElement(By.xpath("//a[text()='brands']"));
	    
	    Actions builder =new Actions(driver);
	    builder.moveToElement(brands).build().perform();
	    
	    WebElement searchBox = driver.findElement(By.id("brandSearchBox"));
	    searchBox.clear();
	    searchBox.sendKeys("L'Oreal Paris");
	    
		//3. Click L'Oreal Paris
	    driver.findElement(By.linkText("L'Oreal Paris")).click();
	  
	    //4. Check the title contains L'Oreal Paris
	    String title = driver.getTitle();
	    System.out.println(title);
	    boolean verifyTitle = title.contains("L'Oreal Paris");
	    System.out.println(verifyTitle);
	    
	    //5.. Click sort By and select customer top rated
	    driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
	    driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
	    
	    //6. Click Category and click Hair->Click haircare->Shampoo
	    //Category
	    driver.findElement(By.xpath("//span[text()='Category']")).click();
	    //hair
	    driver.findElement(By.xpath("//span[text()='Hair']")).click();
	    //hair care
	    driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
	    //Shampoo
	    driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
	    
	    //7. Click->Concern->Color Protection
	    //Concern
	    driver.findElement(By.xpath("//span[text()='Concern']")).click();
	    //color protection
	    driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
	    
	    //8.check whether the Filter is applied with Shampoo
	    
	    //9. Click on L'Oreal Paris Colour Protect Shampoo
	    ////div[text()='L'Oreal Paris Colour Protect Shampoo With UVA & UVB For Colo...']----->Doubt
	    //div[text()="'L'Oreal Paris Colour Protect Shampoo With UVA & UVB For Colo...']";
	    driver.findElement(By.xpath("//div[contains(text(),'Colour Protect')]")).click();
	    
	    //10. GO to the new window and select size as 175ml
	    
	    String currWind = driver.getWindowHandle();
	    Set<String> allWind = driver.getWindowHandles();
	    
	    for(String eachWind: allWind) {
	    	if(!currWind.equalsIgnoreCase(eachWind)) {
	    		driver.switchTo().window(eachWind);
	    	}
	    }
	    
	    driver.findElement(By.xpath("//span[text()='180ml']")).click();
	    
	    //11. Print the MRP of the product
	    String mrp = driver.findElement(By.xpath("(//span[text()='MRP:']/following-sibling::span)[1]")).getText();
	    System.out.println(mrp);
	    
	    //12. Click on ADD to BAG
	    driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
	    //13. Go to Shopping Bag 
	    driver.findElement(By.xpath("//*[local-name()='svg']/following-sibling::*[name()='span' and @class='cart-count']")).click();
	    
	    //14. Print the Grand Total amount
	    
	   //frame
	    WebElement frame = driver.findElement(By.className("css-acpm4k"));
	    driver.switchTo().frame(frame);
	    String grandTotal = driver.findElement(By.xpath("//span[text()='Grand Total']/preceding::span[1]")).getText();
	    System.out.println("GrandTotal is "+grandTotal);
	    
	    //15. Click Proceed
	    
	   driver.findElement(By.xpath("//span[text()='Proceed']")).click();
	   //16. Click on Continue as Guest

	    driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	    //17. Check if this grand total is the same in step 14
	    String priceDetails = driver.findElement(By.xpath("//p[text()='Price Details']/parent::div/parent::div/p")).getText();
	    
	    if(grandTotal.equals(priceDetails)) {
	    	System.out.println("Both rate are matching");
	    }else {
	    	System.out.println("Not matching");
	    }
	    
	    driver.quit();
	    
	    
	 

	    
	    


	}

}
