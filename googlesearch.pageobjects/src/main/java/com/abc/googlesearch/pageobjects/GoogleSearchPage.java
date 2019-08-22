package com.abc.googlesearch.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Thusitha Bandara
 * @date 20/08/2019
 * 
 *
 */

public class GoogleSearchPage extends BasePageObject {

	public GoogleSearchPage(WebDriver driver) {

		super(driver);

	}

	By googleSearchTextField = By.name("q");
	By googleSearchBtn = By.name("btnK");

	public void typeSearchText(String searchText) throws Exception{

		writeText(googleSearchTextField, searchText);
	}

	public GoogleSearchResultsPage clickSearchButton() throws Exception{

		click(googleSearchBtn);
		return new GoogleSearchResultsPage(driver);
	}

}
