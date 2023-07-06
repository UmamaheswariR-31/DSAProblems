package hwAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomationScenario {
	/**
	 * 1.Load the URL https://www.amazon.in/
    2.search as oneplus 9 pro 
3.Get the price of the first product
4. Print the number of customer ratings for the 
first displayed product
5. Click the first text link of the first image
6. Take a screen shot of the product displayed
7. Click 'Add to Cart' button
8. Get the cart subtotal and verify if it is correct.
9.close the browser
	 * 
	 * 
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// 2.search as oneplus 9 pro 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		//click on searcj
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(5000);
		
		//3.Get the price of the first product
	//	String firstProductPrize = driver.findElement(By.xpath("(//a[@class='a-size-base a-link-normal s-no-hover s-underline-text s-underline-link-text s-link-style a-text-normal']/span[@class='a-price']/span[@class='a-offscreen'])[1]")).getText();
		String firstProductPrize = driver.findElement(By.xpath("//span[text()='45,999']")).getText();
		
		System.out.println("First Product Prize: "+firstProductPrize);
		
		//4. Print the number of customer ratings for the first displayed product
		
		//String customerRating = driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative']/i[@class='a-icon a-icon-star-small a-star-small-3 aok-align-bottom']/span)[1]")).getText();
		//String customerRating = driver.findElement(By.xpath("//span[text()='2.9 out of 5 stars']")).getText();
		String customerRating = driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-small a-star-small-3 aok-align-bottom']/span[text()='2.9 out of 5 stars']")).getText();
		System.out.println("Customer Rating "+customerRating);

	}

}
