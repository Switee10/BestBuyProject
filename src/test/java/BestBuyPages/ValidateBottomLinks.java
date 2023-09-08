package BestBuyPages;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BestBuyUtils.SeWrappersBestBuy;

public class ValidateBottomLinks  extends SeWrappersBestBuy
{
	//choose country
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement country;
	
	@FindBy(xpath="//a[@class='body-copy-sm mr-200']")
	List<WebElement> bottomlink;
	
	public void bottomLinks()
	{
		click(country);
		jsscrollDownBottom();	//scroll to bottom
		for(WebElement link:bottomlink)
		{
			String url=link.getAttribute("href");
			System.out.println(url);
			
		}

		
	}

	
	

}