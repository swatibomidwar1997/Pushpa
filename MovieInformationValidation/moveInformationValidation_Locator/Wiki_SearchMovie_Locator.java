package moveInformationValidation_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wiki_SearchMovie_Locator {

 public WebDriver driver = null;
	
	public Wiki_SearchMovie_Locator(WebDriver driver) {
		this.driver = driver;
		//initializing  all the elements
		PageFactory.initElements(driver, this);
	
		}
	
	
	 //Enter value into searchbox field
		@FindBy(id ="searchInput")
		   private WebElement wiki_searchBox;
					
		   public WebElement getSearchBoxforwiki() {
			return wiki_searchBox;
						
			}
					
	 //Extract relase date element value
		@FindBy(xpath="//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]")
		   private WebElement wiki_releaseDate ;
					
		   public WebElement getReleaseDateforwiki() {
			  return wiki_releaseDate;
						
			}
					
	 //Extract Country name element value
		@FindBy(xpath ="(//td[normalize-space()='India'])[1]")
			private WebElement wiki_countryName;
							
			public WebElement getCountryNameforwiki() {
			   return wiki_countryName;
								
			}

							
				

	
	
}
