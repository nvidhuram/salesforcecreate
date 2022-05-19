package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.XPATH, "//span[text()='Home']"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}
	
	public NewOpportunityPage clickGlobalAction() throws InterruptedException {
		Thread.sleep(20000);		
		click(locateElement(Locators.XPATH, "//div//lightning-primitive-icon/*[@class='slds-icon slds-icon_x-small']"));
		return new NewOpportunityPage();
	}
	
	
}
