import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWeb {
	
	public static void ChromeWebTestTitle()
	{
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		String baseUrl = "http://www.bdinfoblog.com";
        	String expectedTitle = "BDInfoblog.com";
        	String actualTitle = "";
                
        	ChromeDriver driver = new ChromeDriver();
        
        	driver.get(baseUrl);
        	actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)){
		    System.out.println("Test Passed! - ChromeWeb");
		} else {
		    System.out.println("Test Failed");
		}              
		driver.close();
	}
}
