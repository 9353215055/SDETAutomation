package Pages;

import java.net.MalformedURLException;
import io.cucumber.java.en.Given;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class MainPage {
	private WebDriver driver;
	private LoginDeatils loginDeatils;
	private InpatientWard inpatientWard;
	private Registerapatient registerapatient;
	private Findingtheprecord findingtheprecord;
	private Updatedeatils updatedeatils;
	@BeforeTest
	
	@Given("open the website page")
    public void open_the_website_page() throws MalformedURLException {
        
    	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
		
		loginDeatils = new LoginDeatils(driver);
		registerapatient =new Registerapatient(driver);
		inpatientWard = new InpatientWard(driver);
		findingtheprecord = new Findingtheprecord(driver);
		updatedeatils = new Updatedeatils(driver);
}
	@Test
	@When("testLoginAndNavigate")
	public void testLoginAndNavigate() throws InterruptedException {
		loginDeatils.EnterCredetialdeatilsnovalid();
		loginDeatils.EnterCredetialdeatilsnotvalid();
        loginDeatils.EnterCredetialdeatils();
	}
	@Then ("PatientDeatils")
       public void PatientDeatils() throws InterruptedException
        {
      inpatientWard.EnterWeatherdeatils();
      registerapatient.PatientDeatils1();;
      findingtheprecord.finding();
     updatedeatils.updatedeatilspatient();
      }
	
   @AfterTest
public void closeDriver()
	{
		//driver.quit();
	}
}

