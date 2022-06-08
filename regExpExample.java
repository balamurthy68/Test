package code;
import java.util.regex.*;


public class regExpExample  {
    public static void main(String[] args) {
        /*
    	System.setProperty ("webdriver.chrome.driver","D://seleniu//chromedriver.exe" );
		
    	WebDriver driver = new ChromeDriver();
        // And now use this to visit Google
        driver.get("file:///D:/Bala%20laptop/RPS/Examples/sample.html");
        
        String timeString = driver.findElement(By.id("txt")).getText();     
        
        System.out.println(timeString); 
        
        Pattern p = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        Matcher m = p.matcher(timeString);
    */    
    	String exampleString = "Harrybpotterabcd";
    	//Pattern p = Pattern.compile(".*potter.*");
        //String begins with H
    	Pattern p = Pattern.compile("^H.*");
    	
        ////*[@id="ct"]
    	//hh:mm:ss
    	//String exampleString = "04:30:45";
     	//Pattern p = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        
     	
    	//String exampleString = "Jun 14, 2021";
    	
    	
    	//Pattern p = Pattern.compile("[A-Z,a-z]{3} [0-9]{2}, [0-9]{4}");
    	
    
    	Matcher m = p.matcher(exampleString);
        
        boolean b = m.matches();
        
        System.out.println(b);       
        
        //Close the browser
      //  driver.quit();
    }
}