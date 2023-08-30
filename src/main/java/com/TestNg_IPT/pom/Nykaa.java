package com.TestNg_IPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.TestNg_IPT.base.BaseClass;


public class Nykaa extends BaseClass implements Nykaainter {
    
	public Nykaa() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath = cursor_xpath)
	WebElement cursor;
	@FindBy (linkText = powder_text )
	WebElement powder;
	@FindBy (className = Himalaya_class)
	WebElement Himalaya;
	@FindBy (className = dropdown_class)
	WebElement dropdown;
	@FindBy (className = addtocart_class)
	WebElement Addto_cart;
	
	
	
	
	
	public WebElement getCursor() {
		return cursor;
	}
	public WebElement getPowder() {
		return powder;
	}
	public WebElement getHimalaya() {
		return Himalaya;
	}
	public WebElement getDropdown() {
		return dropdown;
	}
	public WebElement getAddto_cart() {
		return Addto_cart;
	}
	
	
}

