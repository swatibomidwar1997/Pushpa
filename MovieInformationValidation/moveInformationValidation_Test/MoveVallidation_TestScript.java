package moveInformationValidation_Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import moveInformationValidation_Action.SearchMovie_Action;

	public class MoveVallidation_TestScript {
	public WebDriver driver;
		
		@Test(priority = 0)
		public void TestScript() throws InterruptedException  {
			
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
				 
		driver=new ChromeDriver();
	    driver.get("https://www.imdb.com/");
	    
	    driver.manage().window().maximize();
	    
	    SearchMovie_Action SMA=new SearchMovie_Action(driver);
	    SMA.serachclick("Pushpa: The Rise");
	    SMA.selectTitle();
	    
	    
	    
	    driver.get("https://en.wikipedia.org/wiki/Main_Page");
	    Thread.sleep(1000);
	    
	    SearchMovie_Action SMA1=new SearchMovie_Action(driver);
	    SMA1.wiki_serachclick("Pushpa: The Rise");
	    
	    Thread.sleep(3000);
	    SMA1.wiki_selectTitle();
	    
	    
		}
		
		@Test(priority = 1)
		public void verifyDetails() {
			
			Assert.assertEquals(SearchMovie_Action.idbm_countryName, SearchMovie_Action.wiki_countryName);
		    Assert.assertEquals(SearchMovie_Action.idbm_releaseDateIndia, SearchMovie_Action.wiki_releaseDate);
		    
		    
		    driver.close();
		}
	
	}



