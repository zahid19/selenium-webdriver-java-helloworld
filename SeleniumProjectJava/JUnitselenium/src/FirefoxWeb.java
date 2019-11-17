import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWeb {

	public static void FirefoxWebTestTitle()
	{		
    	System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
    	      
    	String baseUrl = "http://www.bdinfoblog.com";
        String expectedTitle = "BDInfoblog.com";
        String actualTitle = "";
                        
        FirefoxDriver driver = new FirefoxDriver();
        
        driver.get(baseUrl);
        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed! - Firefox Web");
        } else {
            System.out.println("Test Failed");
        }              
        driver.close();
	}
}
