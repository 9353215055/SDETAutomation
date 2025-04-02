package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Findingtheprecord {
WebDriver driver;
	
	public  Findingtheprecord (WebDriver driver)
    {
        this.driver = driver;
        
    }
	
	public void finding()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[contains(text(),'Edit Registration Information')]")).click();//nextbutto

		driver.findElement(By.xpath("//img[@src='/openmrs/ms/uiframework/resource/uicommons/images/logo/openmrs-with-title-small.png']")).click();//nextbutto
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")).click();//nextbutto

		 WebElement search = driver.findElement(By.xpath("//input[@id='patient-search']"));
		 search.sendKeys("nik");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).click();//
	}
}
