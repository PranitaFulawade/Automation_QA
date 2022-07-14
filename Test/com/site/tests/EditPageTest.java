package com.site.tests;

import org.junit.Test;

import POM.HomePage;
import junit.framework.Assert;

public class EditPageTest extends Base{
	
	HomePage h;
	@Test
	public void testHomePage()
	{
		h=new HomePage(driver);
		h.clickOnEditBtn();
		Assert.assertEquals("http://leafground.com/pages/Edit.html", driver.getCurrentUrl());
	}

}
