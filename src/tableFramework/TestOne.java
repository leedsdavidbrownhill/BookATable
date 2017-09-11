package tableFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.search;
import utility.ExcelUtils;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "~/eclipse-workspace/BookATable/chromedriver.exe");
		// Create a new instance of the Chrome driver
		WebDriver driver = (WebDriver) new ChromeDriver();
		
		
        //Launch the Online Store Website
		driver.get("https://erb.bookatable.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website");
 
		//Wait for 5 Sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String Title = driver.getTitle();
		System.out.println("Title of the page is : " + Title);
		
		String input_query = ExcelUtils.getCellData(1, 1);		
		
		System.out.println("Open Menu: " + input_query);			
		search.lnk_Query(driver).sendKeys(input_query);
		
		
		
        // Close the driver
        driver.quit();
		
		
	}

}
