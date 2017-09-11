package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class services {

	private static WebElement element = null;
	
	public static WebElement expand_Settings(WebDriver driver){
		
		element = driver.findElement(By.className("nwt-global-navigation-v2__link-icon"));		 	
		 
		return element;
		 
	}		 	

	public static WebElement expland_Services(WebDriver driver){
		
		element = driver.findElement(By.id("service_settings"));		 	
		 
		return element;
		 
	}	
	
	public static WebElement add_Services(WebDriver driver){
		
		element = driver.findElement(By.className("add_service_class"));		 	
		 
		return element;
		 
	}
	
}
