package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registerapatient {
WebDriver driver;
	
	public  Registerapatient (WebDriver driver)
    {
        this.driver = driver;
        
    }
	
	public void PatientDeatils1() throws InterruptedException
	{
		
	   WebElement givenName = driver.findElement(By.xpath("//input[contains(@name,'givenName')]"));
	   givenName.sendKeys("Nik");
	   WebElement familyName = driver.findElement(By.xpath("//input[contains(@name,'familyName')]"));
	   familyName.sendKeys("N");
   	  driver.findElement(By.id("next-button")).click();//nextbutton
   	  //select the gender
   	 Select dropdown = new Select(driver.findElement(By.id("gender-field")));
   	dropdown.selectByValue("M");
   	driver.findElement(By.id("next-button")).click();//nextbutton
   	WebElement birthdateDay = driver.findElement(By.xpath("//input[contains(@name,'birthdateDay')]"));
   	birthdateDay.sendKeys("14");
   	Select dropdown1 = new Select(driver.findElement(By.id("birthdateMonth-field")));
   	dropdown1.selectByValue("12");
	WebElement birthdateYear = driver.findElement(By.xpath("//input[@id='birthdateYear-field']"));
	birthdateYear.sendKeys("1999");
	driver.findElement(By.id("next-button")).click();//nextbutton
	//address
	WebElement Address = driver.findElement(By.xpath("//input[contains(@name,'address1')]"));
	Address.sendKeys("address");
	WebElement Address2 = driver.findElement(By.xpath("//input[contains(@name,'address2')]"));
	Address2.sendKeys("address");
	WebElement City = driver.findElement(By.xpath("//input[contains(@name,'cityVillage')]"));
	City.sendKeys("bangalore");
	WebElement State = driver.findElement(By.xpath("//input[contains(@name,'stateProvince')]"));
	State.sendKeys("Nik");
	WebElement Country = driver.findElement(By.xpath("//input[contains(@name,'country')]"));
	Country.sendKeys("India");
	WebElement PostalCode = driver.findElement(By.xpath("//input[contains(@name,'postalCode')]"));
	PostalCode.sendKeys("560099");
	driver.findElement(By.id("next-button")).click();//nextbutton
//phoneno
	WebElement Phoneno = driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]"));
	Phoneno.sendKeys("1234567898");
	driver.findElement(By.id("next-button")).click();//nextbutton
	// patient related to
	Select relationship_type = new Select(driver.findElement(By.id("relationship_type")));
	relationship_type.selectByValue("8d91a210-c2cc-11de-8d13-0010c6dffd0f-B");
	WebElement PersonName = driver.findElement(By.xpath("//input[@placeholder='Person Name']"));
	PersonName.sendKeys("hii");
	driver.findElement(By.id("next-button")).click();//nextbutton
	driver.findElement(By.id("submit")).click();//submit
	
	}
}