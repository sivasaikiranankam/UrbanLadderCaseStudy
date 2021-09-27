package com.UrbanLadderCS.Runner;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.UrbanLadderCS.PageObjects.ULCSHomePageObjects;
import com.UrbanLadderCS.ResuableComponents.Base;
import com.UrbanLadderCS.ResuableComponents.ReusableMethods;
import com.UrbanLadderCS.Utilities.ULCSExcelReader;
import com.UrbanLadderCS.Utilities.ULCSPropertyFileReader;

public class ULCSAllTestCasesRunner extends Base {
	
	@Test(priority=0)
	public void Open1() throws IOException, InterruptedException
	{
		
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		logger.info("Intialized driver");
		OpenUrl();
		logger.info("Open Url");
		
		ULCSHomePageObjects hpgo= new ULCSHomePageObjects(driver);
		hpgo.ClosingPopup().click();
		Thread.sleep(5000);
		hpgo.clickingSearchBox().sendKeys("Bed");
		logger.info("entered bed in searchbox");
		hpgo.clickingSearchButton().click();
		if(hpgo.CheckingBed1().isDisplayed()) {
		System.out.println("Bed is  Present"+hpgo.CheckingBed1());
		}
		else
		{
			System.out.println("Bed is not present");
		}
		driver.close();
		logger.info("entered bed in searchbox");
		
	}
	
	//Test2

	@Test(priority=1)
	public void Open2() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		logger.info("Intialized driver");
		OpenUrl();
		logger.info("open url");
		ULCSHomePageObjects hpgo= new ULCSHomePageObjects(driver);
		hpgo.ClosingPopup().click();
		Thread.sleep(5000);
		hpgo.clickingcupboard().click();
		logger.info("clicked cupboard button successfully");
		System.out.println("cupboard name  :"+hpgo.clickingcupboard1().getAttribute("title"));
		System.out.println("cupboard Price  :"+hpgo.checkingcupboard1price().getText());
		driver.close();
		logger.info("close driver");
	}
	
	//Test3
	@Test(priority=3)
	public void Open3() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		ULCSHomePageObjects hpgo= new ULCSHomePageObjects(driver);
		hpgo.ClosingPopup().click();
		Thread.sleep(5000);
		hpgo.ClickingAboutUs().click();
		logger.info("Clicked on AboutUs successfully");
		String s=hpgo.AboutLadderpara().getText();
		System.out.println(s);
		
		driver.close();
		logger.info("close driver");
	}
	
	//Test4
	
	@Test(priority=5)
	public void Open4() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		ULCSHomePageObjects hpgo= new ULCSHomePageObjects(driver);
		hpgo.ClosingPopup().click();
		Thread.sleep(5000);
		hpgo.clickingbookshelf().click();
		logger.info("clicked on bookshelf icon");
		hpgo.clickingbookshelf1().click();
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle);
            logger.info("window handling had done");
            System.out.println(" "+driver.getTitle());
           hpgo.addcartbutton().click();
          
            }
        }

	}
	//Test5
	@Test(priority=2)
	public void Open5() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		ULCSHomePageObjects hpgo= new ULCSHomePageObjects(driver);
		hpgo.ClosingPopup().click();
		Thread.sleep(5000);
		hpgo.coffeetablesbut().click();
		logger.info("clicked on coffee tablestand");
		int n=driver.findElements(By.tagName("img")).size();
		System.out.println("number of images of coffeetables items are "+ n);
		
		driver.close();
	}
//Test6
	
	@Test(priority=4)
	public void Open6() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		ULCSHomePageObjects hpgo= new ULCSHomePageObjects(driver);
		hpgo.ClosingPopup().click();
		Thread.sleep(5000);
		hpgo.clickingPintrest().click();
		logger.info("clicked on pinterest");
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle);
            logger.info("navigated to pinterest website");
		System.out.println(hpgo.followerscount().getText());
            }
        }
		
	}
	
	//Test7
	
	@Test(priority=6)
	public void Open7() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		ULCSHomePageObjects hpgo= new ULCSHomePageObjects(driver);
		hpgo.ClosingPopup().click();
		Thread.sleep(5000);
		hpgo.GetStudyTable().click();
		logger.info("clicked on study table");
		System.out.println("All Stocks: "+hpgo.GetProductsCount().getText());
		hpgo.GetCheckBox().click();
		Thread.sleep(5000);
			System.out.println("All in-Stocks: "+hpgo.GetProductsCount().getText());
	}
	
	//Test8
	
	@Test(priority=8)
	public void Open8() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		ULCSHomePageObjects hpgo= new ULCSHomePageObjects(driver);
		hpgo.ClosingPopup().click();
		Thread.sleep(5000);
		hpgo.clickingSales().click();
		logger.info("clicked on stores icon");
		hpgo.hoveringtocity().click();
		logger.info("hovered to city");
		Thread.sleep(5000);
		hpgo.gettingaddress().click();
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle);
           System.out.println(hpgo.addressget1().getText());
           
	}
        }
        driver.close();
	}
	
	//Test9
	
	@Test(dataProvider="getData",priority=7)
	public void Open9(String ordi,String Phno) throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		ULCSHomePageObjects hpgo= new ULCSHomePageObjects(driver);
		hpgo.ClosingPopup().click();
		Thread.sleep(5000);
		hpgo.TrackOrder().click();
		logger.info("clicked on trackorder");
		hpgo.Orderid().sendKeys(ordi);
		logger.info("entered order id");
		hpgo.PhoneNumber().sendKeys(Phno);
		logger.info("entered phone number");
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		prop=ULCSPropertyFileReader.LoadFile();
		String p=prop.getProperty("path");
		String file=prop.getProperty("fileName");
		String sheet=prop.getProperty("sheetName");
		Object[][] data=ULCSExcelReader.readExcel(p,file,sheet);
		
		return data;
	}
	
	//Test10
	
	@Test(priority=9)
	public void Open10() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		ULCSHomePageObjects hpgo= new ULCSHomePageObjects(driver);
		hpgo.ClosingPopup().click();
		Thread.sleep(5000);
		hpgo.clickingSearchBox().sendKeys("sofa");
		hpgo.clickingSearchButton().click();
		
		Actions action = new Actions(driver);
		  
		  action.moveToElement(hpgo.sofaclick()).perform();
		  action.moveToElement(hpgo.sofachecked()).click().perform();
		  Thread.sleep(5000);
		  logger.info("CHECKING SOFA SPECIFICATION IS CHECKED OR NOT???");
		  if(hpgo.sofachecked().isSelected())
		  {
			  System.out.println("Checkbox Got selected");
			  
		  }
		  
	}
	
	@AfterMethod
	public void closeDriverM()
	{
		driver.quit();
	}
	
	
	
	

}
