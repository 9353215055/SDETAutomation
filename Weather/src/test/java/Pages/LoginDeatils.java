package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginDeatils {
	WebDriver driver;
	
	public  LoginDeatils (WebDriver driver)
    {
        this.driver = driver;
        
    }
	
	public void EnterCredetialdeatils() throws InterruptedException
    {
		WebElement gmail = driver.findElement(By.id("username"));
		gmail.sendKeys("admin");
		WebElement submit=driver.findElement(By.id("password"));
		submit.sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
		 driver.findElement(By.id("loginButton")).click();

    }
	
	public void EnterCredetialdeatilsnovalid() throws InterruptedException
    {
		WebElement gmail = driver.findElement(By.id("username"));
		gmail.sendKeys("admin1");
		WebElement submit=driver.findElement(By.id("password"));
		submit.sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
	    driver.findElement(By.id("loginButton")).click();	 
		
	    WebElement errorMsg=driver.findElement(By.id("error-message"));
		String actualMsg = errorMsg.getText();
        String expectedMsg = "Invalid username/password. Please try again.";
        
        assertEquals(actualMsg, expectedMsg, "Login Failure Assertion Failed");
		
    }
	

	public void EnterCredetialdeatilsnotvalid() throws InterruptedException
    {
		WebElement gmail = driver.findElement(By.id("username"));
		gmail.sendKeys();
		WebElement submit=driver.findElement(By.id("password"));
		submit.sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();;
	    driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("loginButton")).click();	 
	
		
		WebElement errorMsg=driver.findElement(By.id("error-message"));
		String actualMsg = errorMsg.getText();
        String expectedMsg = "Invalid username/password. Please try again."; // Expected failure message
        
        assertEquals(actualMsg, expectedMsg, "Successful Login Assertion Failed");
		
	    
    }
}
