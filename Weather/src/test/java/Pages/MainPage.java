package Pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainPage {
	private WebDriver driver;
	private LoginDeatils loginDeatils;
	private InpatientWard inpatientWard;
	private Registerapatient registerapatient;
	private Findingtheprecord findingtheprecord;
	private Updatedeatils updatedeatils;
	@BeforeTest
    public void setup() throws MalformedURLException {
        
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
	public void testLoginAndNavigate() throws InterruptedException {
		loginDeatils.EnterCredetialdeatilsnovalid();
		//loginDeatils.EnterCredetialdeatilsnotvalid();
        loginDeatils.EnterCredetialdeatils();
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

