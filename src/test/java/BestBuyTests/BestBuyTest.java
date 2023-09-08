package BestBuyTests;

import org.testng.annotations.Test;
import BestBuyUtils.WrappersBestBuy;
import BestBuyUtils.Reports;
import BestBuyUtils.SeWrappersBestBuy;

public class BestBuyTest extends SeWrappersBestBuy
{
	WrappersBestBuy bbw=new WrappersBestBuy();
	SeWrappersBestBuy se= new SeWrappersBestBuy();
	

	@Test(priority=1)
	public void TestcaseLaunchBrowser()
	{
		Reports.startReport();
		Reports.setTCDesc("Valid BestBuyLaunchBrowser functionality");
		launchBrowser("https://www.bestbuy.com/");	//launch browser test case
		
	}
	
	@Test(priority=2)
	public void createaccTestcase() throws InterruptedException
	{
		//create acc test case
		Reports.setTCDesc("Valid BestBuycreateAcc functionality");

		launchBrowser("https://www.bestbuy.com/");	
		bbw.SignUp("switee", "sonawane", "switeesonawane10@gmail.com", "my name is sweety", "my name is sweety", "8788154200");
		
	}
	
	@Test(priority=3)
	public void validLoginTestcase() throws InterruptedException
	{
		//login to best buy test case
		Reports.setTCDesc("Valid BestBuyLoginFunctionality functionality");

		launchBrowser("https://www.bestbuy.com/");	
		bbw.loginBestbuy();
		screenshot("signup_valid");

		
	}
	
	@Test(priority=4)
	public void InvalidLoginTestCase() throws InterruptedException
	{
		//login negative test case
		Reports.setTCDesc("Valid BestBuyinvalidLogin functionality");

		bbw.invalidloginBestbuy("switeesonawane@gmail.com", "my name is switee");
		
	}
	@Test(priority=5)
	public void menuNavigate()
	{
		//navigate to menu test case
		Reports.setTCDesc("Valid BestBuy NavigatetoMenu functionality");

		launchBrowser("https://www.bestbuy.com/");	
		bbw.NavigatetoMenupage();
	}
		
	@Test(priority=6)
	public void bottomLink()
	{
		launchBrowser("https://www.bestbuy.com/");
		bbw.bottomLink();	
	}
	
	@Test(priority=7)
	public void AddItems() throws InterruptedException
	{
		Reports.setTCDesc("Valid BestBuy AddItems functionality");

		launchBrowser("https://www.bestbuy.com/");	//launch browser test case

		bbw.AddItemsToCart("Dell core i5 7th generation");
	}
	
	@Test(priority=8)
	public void addShopbyDept() throws InterruptedException
	{
		Reports.setTCDesc("Valid BestBuy shopbyDepartment functionality");

		launchBrowser("https://www.bestbuy.com/");	
		bbw.shopBydepartment();
		
	}
	
	@Test(priority=9)
	public void SelectByBrand()
	{
		Reports.setTCDesc("Valid BestBuy SelectbyBrand functionality");

		launchBrowser("https://www.bestbuy.com/");	
		bbw.selectbyBrand();
	}
	
	@Test(priority=10)
	public void CheckoutToPayment() throws InterruptedException
	{
		Reports.setTCDesc("Valid BestBuy select brand functionality");

		launchBrowser("https://www.bestbuy.com/");	
		bbw.loginBestbuy();
		bbw.Paymentcheckout();
	}
}


