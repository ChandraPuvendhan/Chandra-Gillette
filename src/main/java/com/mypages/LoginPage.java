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
public class LoginPage extends BasePage {
//page locators:
	private By signIn = By.xpath("//a[@title='SIGN IN']");
	private By emailId = By.xpath("//input[@id='phdesktopbody_0_username']");
	private By password = By.xpath("//input[@name='phdesktopbody_0$ctl04']");
	private By loginButton = By.xpath("//input[@id='phdesktopbody_0_Sign In']");
	private By header = By.xpath("//i18n-string[contains(text(),\"Don't have an account?\")]");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
//public getters: encapsulation
	
	public WebElement getsignIn() {
		return getElement(signIn);
	}

	public void setsignIn(By signIn) {
		this.signIn = signIn;
	}
	
	/**
	 * @return the emailId
	 */
	public WebElement getEmailId() {
		return getElement(emailId);
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(By emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(By password) {
		this.password = password;
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}

	/**
	 * @param loginButton the loginButton to set
	 */
	public void setLoginButton(By loginButton) {
		this.loginButton = loginButton;
	}

	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(By header) {
		this.header = header;
	}
	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	/**
	 * 
	 * @param username
	 * @param pwd
	 * @return
	 */
	public HomePage doLogin(String username, String pwd) {
		getsignIn().click();
		getEmailId().sendKeys(username);
		getPassword().sendKeys(pwd);
		getLoginButton().click();
		
		return getInstance(HomePage.class);
	}
	
	/**
	 * 
	 * @return
	 */
	public void doLogin() {
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
		
		
	}
	//username: naven@gmail.com
	public void doLogin(String userCred) {
		if(userCred.contains("username")){
			getEmailId().sendKeys(userCred.split(":")[1].trim());
		} else if(userCred.contains("password")){
			getEmailId().sendKeys(userCred.split(":")[1].trim());
		}
		getLoginButton().click();
	}
}
