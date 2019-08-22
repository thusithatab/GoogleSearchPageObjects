package com.abc.googlesearch.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Thusitha Bandara
 * @date 20/08/2019
 * 
 *
 */

public class GoogleSearchResultsPage extends BasePageObject {

	private By SearchResult;

	// private By FirstSearchResultSet;

	public GoogleSearchResultsPage(WebDriver driver) {
		super(driver);

	}

	public NavigatedWebPage clickOnResult(int ResultNumberToClick) throws Exception {

		int resultsSetOne = driver.findElements(By.xpath("//div[@class='bkWMgd'][1]//div[@class='g']")).size();
		int resultsSetTwo = driver.findElements(By.xpath("//div[@class='bkWMgd'][3]//div[@class='g']")).size();
		int resultsSetThree = driver.findElements(By.xpath("//div[@class='bkWMgd'][5]//div[@class='g']")).size();

		if (ResultNumberToClick <= resultsSetOne) {

			SearchResult = By.xpath("(//h3)[" + ResultNumberToClick + "]/ ../ ../a");

		} else if (ResultNumberToClick <= (resultsSetOne + resultsSetTwo)) {

			SearchResult = By.xpath("//div[@class='bkWMgd'][3]//div[@class='g']["
					+ (ResultNumberToClick - resultsSetOne) + "]//div[@class='r']/a");

		} else if (ResultNumberToClick <= (resultsSetOne + resultsSetTwo + resultsSetThree)) {

			SearchResult = By.xpath("//div[@class='bkWMgd'][5]//div[@class='g']["
					+ (ResultNumberToClick - (resultsSetOne + resultsSetTwo)) + "]//div[@class='r']/a");

		}

		click(SearchResult);

		return new NavigatedWebPage(driver);
	}

}
