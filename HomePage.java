package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;


public class HomePage {
	static WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	//this is a comment
	// search functionality
	String myString = "   ";
By menuSearch=By.id("menuSearch");	
By searchBox = By.id("autoComplete");
By resultFound = By.xpath("//a[contains(@class,'titleItemsCount')]");
By resultNotFound = By.xpath("//*[contains(text(),'No results for')]");
By username = By.id("Username");
By password = By.id("password");
By submit = By.id("submit");


public boolean searchfor (String searchstr) throws IOException
{
	boolean found;
	
	driver.navigate().to("http://advantageonlineshopping.com/");
	
	driver.findElement(searchBox).sendKeys(searchstr + Keys.ENTER);
//	driver.findElement(searchBtn).click();
	
	try {
		
		//if result is not found for the keyword
	      driver.findElement(resultNotFound);
	      found = false;
	        TakesScreenshot scrShot =((TakesScreenshot)driver);
	        //Call getScreenshotAs method to create image file
	        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	       //Move image file to new destination
	        String filename = "d:/infy/noResults" + searchstr + ".png";
	         File DestFile=new File(filename);
	      //Copy file at destination
	        FileUtils.copyFile(SrcFile, DestFile);
	        
	        
	        //Reporter.addScreenCaptureFromPath("d:/infy/nosearch.png", searchstr);
	        
	      
	}
	//if result is found
	catch (NoSuchElementException e)
	{
		found = true;
		
	}
	return found;
	
}

//Write a method to check if username box is present in the homepage

public boolean isUsernameBoxVisible()
{
     boolean isVisible = false;
     
     isVisible = driver.findElement(username).isDisplayed();
     
	
	
	return isVisible ;
	
}


public boolean login(String un,String pw)
{
	
	boolean loginstatus = false;
	
         driver.findElement(username).sendKeys(un);
         driver.findElement(password).sendKeys(pw);
         driver.findElement(submit).click();

         try {
        	 //try to check if welcome is found
        	 
        	 loginstatus =true;
         }
         catch (NoSuchElementException e)
         {
        	 loginstatus = false;
         }
   return loginstatus;

}



}
