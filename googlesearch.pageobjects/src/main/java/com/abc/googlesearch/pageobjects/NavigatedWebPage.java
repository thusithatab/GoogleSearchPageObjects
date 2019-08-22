package com.abc.googlesearch.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Thusitha Bandara
 * @date 20/08/2019
 * 
 *
 */

public class NavigatedWebPage extends BasePageObject {

	public NavigatedWebPage(WebDriver driver) throws Exception {
		super(driver);
	}

	public String getPageTitle() throws Exception{

		return driver.getTitle();
	}
}
