package moveInformationValidation_Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import moveInformationValidation_Locator.SearchMovie_Locator;
<<<<<<< HEAD
import moveInformationValidation_Locator.Wiki_SearchMovie_Locator;
=======
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31


public class SearchMovie_Action {
	public static String idbm_countryName=null, idbm_releaseDateIndia=null, wiki_releaseDate=null, wiki_countryName=null ;
	public WebDriver driver = null;
	 SearchMovie_Locator SML= null;
<<<<<<< HEAD
	 Wiki_SearchMovie_Locator WSML=null;
=======
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
	 
		public SearchMovie_Action(WebDriver driver) {
				this.driver = driver;
				SML= new SearchMovie_Locator(driver);
<<<<<<< HEAD
				WSML=new Wiki_SearchMovie_Locator(driver);
			}
		
		
       
	   public void serachclick(String searchbox) {
			WebElement textBox = SML.getSearchBox();
			textBox.sendKeys(searchbox);
			textBox.sendKeys(Keys.ENTER);
			
=======
			}
		
		
        //Enter Searchbox value at IDBM website 
	    public void serachclick(String searchbox) {
			WebElement textBox = SML.getSearchBox();
			textBox.sendKeys(searchbox);
			textBox.sendKeys(Keys.ENTER);
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
			}
	   
	  
	   public void selectTitle() {
		  // To Select Pushpa: The Rise- Part1
		  WebElement select = SML.getSelectedTitle();
<<<<<<< HEAD
		  System.out.println(select);
=======
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
			select.click();
			
		  // To scroll down to get release date & country name
		  WebElement scroll = SML.getScrollDown();
<<<<<<< HEAD
		  System.out.println("HI");
=======
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
			Actions a = new Actions(driver);
		      a.moveToElement(scroll);
		      a.perform();
		      
		  //Release Date Click to get exact value for India release date at IDBM Website   
		  WebElement release = SML.getReleaseDate();
		  release.click();
		  
		  //To store extracted value of country 
		  WebElement country = SML.getCountryName();
		  idbm_countryName=country.getText();
		  
		  //To store extracted value of release date at india.
		  WebElement releaseDateIndia = SML.getReleaseDateIndia();
		  idbm_releaseDateIndia=releaseDateIndia.getText();
		  
		 
	}
	  
//For Enter Values at wiki website
	  public void wiki_serachclick(String wiki_searchbox) {
<<<<<<< HEAD
	         WebElement textBox1 = WSML.getSearchBoxforwiki();
=======
			WebElement textBox1 = SML.getSearchBoxforwiki();
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
			textBox1.sendKeys(wiki_searchbox);
			textBox1.sendKeys(Keys.ENTER);
			}
	  
	  public void wiki_selectTitle() {
		  
<<<<<<< HEAD
		WebElement release1 = WSML.getReleaseDateforwiki();
		wiki_releaseDate=release1.getText();
		 
		   
		WebElement country1 = WSML.getCountryNameforwiki();
=======
		 
		      
		WebElement release1 = SML.getReleaseDateforwiki();
		wiki_releaseDate=release1.getText();
		 
		  
		 
		  
		WebElement country1 = SML.getCountryNameforwiki();
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
		wiki_countryName=country1.getText();
		  
		  
		 
	}
	  
	  
	  
}