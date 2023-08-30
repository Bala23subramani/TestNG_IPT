package com.TestNg_IPT.runner;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.TestNg_IPT.base.BaseClass;
import com.TestNg_IPT.pom.Nykaapom;

public class RunnerIPT1 extends BaseClass{
Nykaapom n = new Nykaapom();
	
	
	
	@BeforeTest
	public void Url() {
		browserLaunch("edge");
		launchUrl("https://www.nykaa.com/");
	}
	
	@Test( priority = 1)
	public void mom_baby() {
		
		moveToElement(n.getny().getCursor());
        
	}
	@Test( priority = 2)
    public void powder() {
    	clickOnElement(n.getny().getPowder());

	}
	
	
	
}


