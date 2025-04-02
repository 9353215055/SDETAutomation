package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Updatedeatils {
WebDriver driver;
	
	public  Updatedeatils (WebDriver driver)
    {
        this.driver = driver;
        
    }
	
	public void updatedeatilspatient  ()
	{
		
		 driver.findElement(By.xpath("//span[@id='edit-patient-demographics']//a[contains(text(),'Edit')]")).click();//
		 WebElement givenName = driver.findElement(By.xpath("//input[contains(@name,'givenName')]"));
		   givenName.sendKeys("Nikh");
		   WebElement familyName = driver.findElement(By.xpath("//input[contains(@name,'familyName')]"));
		   familyName.sendKeys("Nn");
	   	  driver.findElement(By.id("next-button")).click();//nextbutton
	   	driver.findElement(By.id("next-button")).click();//nextbutton
	   	driver.findElement(By.id("next-button")).click();//nextbutton
	   	driver.findElement(By.xpath("//button[@id='registration-submit']")).click();//submit
	   	  
	}
	
}
