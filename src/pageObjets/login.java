package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class services {

	private static WebElement element = null;
	
	public static WebElement login(WebDriver driver){
		
		element = driver.findElement(By.className("nwt-input valid"));		 	
		 
		return element;
		 
	}		 	

	public static WebElement password(WebDriver driver){
		
		element = driver.findElement(By.className("nwt-input valid"));		 	
		 
		return element;
		 
	}	
	
	public static WebElement click_Submit(WebDriver driver){
		
		element = driver.findElement(By.className("nwt-button-primary"));		 	
		 
		return element;
		 
	}
	
}
