package moveInformationValidation_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMovie_Locator {
	
public WebDriver driver = null;
	
	public SearchMovie_Locator(WebDriver driver) {
		this.driver = driver;
		//initializing  all the elements
		PageFactory.initElements(driver, this);
	
	}
	
<<<<<<< HEAD

//Enter value into searchbox field
=======
//FOR IMDB Website Locator
	//Enter value into searchbox field
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
	@FindBy(id ="suggestion-search")
       private WebElement searchBox;
	
	   public WebElement getSearchBox() {
		 return searchBox;
		
	}
<<<<<<< HEAD
//Click on link Pushpa: The Rise - Part 1
=======
	//Click on link Pushpa: The Rise - Part 1
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
	@FindBy(linkText ="Pushpa: The Rise - Part 1")
      private WebElement selectTitle;
	
	  public WebElement getSelectedTitle() {
		return selectTitle;
		
	}
<<<<<<< HEAD
//ScrollDown Upto Also known as text
	@FindBy(xpath ="//a[contains(text(),'Also known as')]")
=======
	//ScrollDown Upto Details
	@FindBy(xpath ="//h3[contains(text(),'Details')]")
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
      private WebElement scrollDown;
	
	  public WebElement getScrollDown() {
		return scrollDown;
		
	}
<<<<<<< HEAD
//To select release date of india we need to first click on existing date & after that select country india
    @FindBy(linkText ="January 7, 2022 (United States)")
=======
	//To select release date of india we need to first click on existing date & after that select country india
	@FindBy(linkText ="January 7, 2022 (United States)")
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
	  private WebElement releaseDate ;
		
	  public WebElement getReleaseDate() {
		return releaseDate;
			
		}
		
<<<<<<< HEAD
//Extract Country name element value
    @FindBy(linkText ="India")
=======
  //Extract Country name element value
   @FindBy(linkText ="India")
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
	  private WebElement countryName ;
				
      public WebElement getCountryName() {
		return countryName;
					
		}
				
<<<<<<< HEAD
//Extract Release Date in India
	@FindBy(xpath="(//td[@align='right'][normalize-space()='17 December 2021'])[5]")
	  private WebElement releaseDateIndia;
	  
=======
 //Extract Release Date in India
	@FindBy(xpath ="//body[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[2]")
	  private WebElement releaseDateIndia;
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
	  public WebElement getReleaseDateIndia() {
		return releaseDateIndia;
					
		}
				
				
<<<<<<< HEAD
=======
//For Wiki website Locator
  //Enter value into searchbox field
	@FindBy(id ="searchInput")
	  private WebElement wiki_searchBox;
				
	  public WebElement getSearchBoxforwiki() {
		return wiki_searchBox;
					
		}
				
  //Extract relase date element value
	@FindBy(xpath ="//body[1]/div[3]/div[3]/div[5]/div[1]/table[1]/tbody[1]/tr[12]/td[1]/div[1]/ul[1]/li[1]")
		private WebElement wiki_releaseDate ;
				
		public WebElement getReleaseDateforwiki() {
		  return wiki_releaseDate;
					
		}
				
  //Extract Country name element value
	@FindBy(xpath ="//td[contains(text(),'India')]")
		private WebElement wiki_countryName;
						
		public WebElement getCountryNameforwiki() {
		   return wiki_countryName;
							
		}

						
			
>>>>>>> 40cc3760610cfb7860d9f3f742453291c911dc31
				
          
				



}
