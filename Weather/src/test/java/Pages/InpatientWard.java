package Pages;



import java.sql.DriverAction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InpatientWard {
WebDriver driver;
	
	public  InpatientWard (WebDriver driver)
    {
        this.driver = driver;
        
    }
	
	public void EnterWeatherdeatils() throws InterruptedException
    {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
    }
	
    }
	

