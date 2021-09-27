package com.UrbanLadderCS.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadderCS.UiStore.ULCSHomePageUi;


public class ULCSHomePageObjects {

	WebDriver driver;
	ULCSHomePageUi hpui=new ULCSHomePageUi();
	public ULCSHomePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement clickingSearchBox()
	{
		return driver.findElement(hpui.clicksearchBox);
	}
	
	public WebElement clickingSearchButton()
	{
		return driver.findElement(hpui.clicksearchButton);
	}
	
	public WebElement CheckingBed1()
	{
		return driver.findElement(hpui.BedCheck1);
	}
	
	public WebElement ClosingPopup()
	{
		return driver.findElement(hpui.closingpopup);
	}
	public WebElement ClickingAboutUs()
	{
		return driver.findElement(hpui.aboutus);
	}
	public WebElement AboutLadderpara()
	{
		return driver.findElement(hpui.aboutladder);
	}
	
	public WebElement clickingcupboard()
	{
		return driver.findElement(hpui.cupboard);
	}
	public WebElement clickingcupboard1()
	{
		return driver.findElement(hpui.cupboard1);
	}
	public WebElement checkingcupboard1price()
	{
		return driver.findElement(hpui.cupboard1price);
	}
	public WebElement clickingbookshelf()
	{
		return driver.findElement(hpui.bookshelf);
	}
	public WebElement clickingbookshelf1()
	{
		return driver.findElement(hpui.bookshelf1);
	}
	
	public WebElement addcartbutton()
	{
		return driver.findElement(hpui.addtocart);
	}
	public WebElement coffeetablesbut()
	{
		return driver.findElement(hpui.cofeetable);
	}
	public WebElement clickingPintrest()
	{
		return driver.findElement(hpui.pinterest);
	}
	
	public WebElement followerscount()
	{
		return driver.findElement(hpui.followers);
	}
	
	public WebElement GetStudyTable()
	{
		return driver.findElement(hpui.StudyTable);
	}
	public WebElement GetProductsCount()
	{
		return driver.findElement(hpui.productCount);
	}
	public WebElement GetCheckBox()
	{
		return driver.findElement(hpui.Checkbox);
	}
	public WebElement clickingSales()
	{
		return driver.findElement(hpui.sales);
	}
	public WebElement hoveringtocity()
	{
		return driver.findElement(hpui.hydsale);
	}
	public WebElement gettingaddress()
	{
		return driver.findElement(hpui.address);
	}
	public WebElement addressget1()
	{
		return driver.findElement(hpui.addressget);
	}
	public WebElement Emailenter1()
	{
		return driver.findElement(hpui.email1);
	}
	public WebElement Passwordenter2()
	{
		return driver.findElement(hpui.pass1);
	}
	public WebElement Orderid()
	{
		return driver.findElement(hpui.orderid);
	}
	public WebElement PhoneNumber()
	{
		return driver.findElement(hpui.phno);
	}
	public WebElement TrackOrder()
	{
		return driver.findElement(hpui.track);
	}
	
	public WebElement sofaclick()
	{
		return driver.findElement(hpui.sofafinish);
	}
	
	public WebElement sofachecked()
	{
		return driver.findElement(hpui.checked);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public WebElement Tv()
	{
		return driver.findElement(hpui.TvUnits);
	}
	
	public WebElement FstTv()
	{
		return driver.findElement(hpui.firstTv);
	}
	
	public WebElement FstTvName()
	{
		return driver.findElement(hpui.tvname);
	}
	
	public WebElement GiftCards()
	{
		return driver.findElement(hpui.gift);
	}
	public WebElement Digitalcards()
	{
		return driver.findElement(hpui.dc);
	}
	
	public WebElement ClickInsta()
	{
		return driver.findElement(hpui.insta);
	}
	
	public WebElement GetPosts()
	{
		return driver.findElement(hpui.posts);
	}
	public WebElement SearchItem()
	{
		return driver.findElement(hpui.Item);
	}
	public WebElement Addtocart()
	{
		return driver.findElement(hpui.addcart);
	}
	public WebElement SelectQuantity()
	{
		return driver.findElement(hpui.quantity);
	}
	public WebElement FinalPrice()
	{
		return driver.findElement(hpui.price);
	}
	public WebElement ChatFrame()
	{
		return driver.findElement(hpui.chat);
	}
	public WebElement ClickChatFrame()
	{
		return driver.findElement(hpui.cchat);
	}
	public WebElement ChatWithBot()
	{
		return driver.findElement(hpui.chatwithus);
	}
	public WebElement ChattextBox()
	{
		return driver.findElement(hpui.chattext);
	}
	public WebElement Emailenter()
	{
		return driver.findElement(h.email);
	}
	public WebElement Passwordenter()
	{
		return driver.findElement(h.pass);
	}
	
	public WebElement Stores()
	{
		return driver.findElement(h.store);
	}
	public WebElement Morecities()
	{
		return driver.findElement(h.more);*/

