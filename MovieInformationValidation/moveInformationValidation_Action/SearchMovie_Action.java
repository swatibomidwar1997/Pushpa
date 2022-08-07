package moveInformationValidation_Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import moveInformationValidation_Locator.SearchMovie_Locator;


public class SearchMovie_Action {
	public static String idbm_countryName=null, idbm_releaseDateIndia=null, wiki_releaseDate=null, wiki_countryName=null ;
	public WebDriver driver = null;
	 SearchMovie_Locator SML= null;
	 
		public SearchMovie_Action(WebDriver driver) {
				this.driver = driver;
				SML= new SearchMovie_Locator(driver);
			}
		
		
        //Enter Searchbox value at IDBM website 
	    public void serachclick(String searchbox) {
			WebElement textBox = SML.getSearchBox();
			textBox.sendKeys(searchbox);
			textBox.sendKeys(Keys.ENTER);
			}
	   
	  
	   public void selectTitle() {
		  // To Select Pushpa: The Rise- Part1
		  WebElement select = SML.getSelectedTitle();
			select.click();
			
		  // To scroll down to get release date & country name
		  WebElement scroll = SML.getScrollDown();
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
			WebElement textBox1 = SML.getSearchBoxforwiki();
			textBox1.sendKeys(wiki_searchbox);
			textBox1.sendKeys(Keys.ENTER);
			}
	  
	  public void wiki_selectTitle() {
		  
		 
		      
		WebElement release1 = SML.getReleaseDateforwiki();
		wiki_releaseDate=release1.getText();
		 
		  
		 
		  
		WebElement country1 = SML.getCountryNameforwiki();
		wiki_countryName=country1.getText();
		  
		  
		 
	}
	  
	  
	  
}