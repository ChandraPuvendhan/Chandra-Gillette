/**
 * 
 */
package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

/**
 * @author Chandra
 *
 */
public class LoginTest extends BaseTest{

	@Test(priority=1)
	public void verifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("title");
		Assert.assertEquals(title, "Men's razors and shavers | Gillette India");
	}
	@Test(priority=2, enabled=false)
	public void verifyLoginPageHeaderTest() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println("header");
		Assert.assertEquals(header, "Don't have an account?");
	}
	@Test(priority=3, enabled=true)
	public void doLoginTest() {
		HomePage homePage = page.getInstance(LoginPage.class).doLogin("mailtochandrasankar@gmail.com", "ch@WL12345");
//		String headerHome = homePage.getHomePageHeader();
//		System.out.println(headerHome);
//		Assert.assertEquals(headerHome, "");
	}
}
