/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Chandra
 *
 */
public class ViewprofilePage extends BasePage{

	private By header = By.className("private-page__title");
	public ViewprofilePage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getHeader() {
		return getElement(header);
	}
	
	//page actions:
	public String getHomePageTitle() {
		return getPageTitle();
	}
	
	public String getHomePageHeader() {
		return getPageHeader(header);
	}
	

}
